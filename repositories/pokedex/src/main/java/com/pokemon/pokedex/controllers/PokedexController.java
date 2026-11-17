package com.pokemon.pokedex.controllers;

import com.pokemon.pokedex.dtos.PokemonDTO;
import com.pokemon.pokedex.entities.Pokemon;
import com.pokemon.pokedex.services.PokedexService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/pokedex")
@AllArgsConstructor
public class PokedexController {
    private final PokedexService service;

    @Operation(summary = "Lista Pokemons", description = "Lista todos os pokemons cadastrados.")
    @ApiResponse(responseCode = "200", description = "Retorna a lista de pokemons")
    @GetMapping
    public ResponseEntity<List<PokemonDTO>> listarPokemons() {
        return ResponseEntity.ok(service.listPokemons());
    }

    @Operation(summary = "Procura um Pokemon", description = "Procura um pokemon em especifico pelo nome.")
    @ApiResponse(responseCode = "200", description = "Retorna o pokemon encontrado")
    @ApiResponse(responseCode = "404", description = "Pokemon não encontrado")
    @GetMapping("/pokemon/{pokemonName}")
    public ResponseEntity<PokemonDTO> procurarPokemon(@PathVariable String pokemonName){
        return ResponseEntity.ok(service.findPokemonByName(pokemonName));
    }

    @Operation(summary = "Adiciona um Pokemon", description = "Cadastra um pokemon na lista.")
    @ApiResponse(responseCode = "201", description = "Pokemon cadastrado com sucesso")
    @ApiResponse(responseCode = "409", description = "Este pokemon já parece estar cadastrado no sistema")
    @PostMapping("/pokemon")
    public ResponseEntity<PokemonDTO> criarPokemon(@RequestBody PokemonDTO pokemon){
        service.addPokemon(pokemon);
        return ResponseEntity.status(HttpStatus.CREATED).body(pokemon);
    }

    @Operation(summary = "Edita um Pokemon", description = "Procura um pokemon em especifico e edita sua informaçoes.")
    @ApiResponse(responseCode = "200", description = "Pokemon editado com sucesso")
    @ApiResponse(responseCode = "404", description = "Pokemon não encontrado")
    @PutMapping("/pokemon/{pokemonName}")
    public ResponseEntity<PokemonDTO> editarPokemon(@RequestBody PokemonDTO newPokemon, @PathVariable String oldPokemonName){
        service.editPokemon(newPokemon,oldPokemonName);
        return ResponseEntity.ok(newPokemon);
    }

    @Operation(summary = "Deleta um Pokemon", description = "Deleta um pokemon em especifico pelo nome.")
    @ApiResponse(responseCode = "200", description = "Pokemon deletado com sucesso")
    @ApiResponse(responseCode = "404", description = "Pokemon não encontrado")
    @DeleteMapping("/pokemon/{pokemonName}")
    public ResponseEntity<Void> deletarPokemon(@PathVariable String pokemonName){
        service.deletePokemonByName(pokemonName);
        return ResponseEntity.noContent().build();
    }
}
