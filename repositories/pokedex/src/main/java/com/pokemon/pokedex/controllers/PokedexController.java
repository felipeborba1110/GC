package com.pokemon.pokedex.controllers;

import com.pokemon.pokedex.dtos.PokemonDTO;
import com.pokemon.pokedex.entities.Pokemon;
import com.pokemon.pokedex.services.PokedexService;
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

    @GetMapping
    public ResponseEntity<List<PokemonDTO>> listarPokemons() {
        return ResponseEntity.ok(service.listPokemons());
    }

    @GetMapping("/pokemon/{pokemonName}")
    public ResponseEntity<PokemonDTO> procurarPokemon(@PathVariable String pokemonName){
        return ResponseEntity.ok(service.findPokemonByName(pokemonName));
    }

    @PostMapping("/pokemon")
    public ResponseEntity<PokemonDTO> criarPokemon(@RequestBody PokemonDTO pokemon){
        service.addPokemon(pokemon);
        return ResponseEntity.status(HttpStatus.CREATED).body(pokemon);
    }

    @PutMapping("/pokemon/{pokemonName}")
    public ResponseEntity<PokemonDTO> editarPokemon(@RequestBody PokemonDTO newPokemon, @PathVariable String oldPokemonName){
        service.editPokemon(newPokemon,oldPokemonName);
        return ResponseEntity.ok(newPokemon);
    }

    @DeleteMapping("/pokemon/{pokemonName}")
    public ResponseEntity<Void> deletarPokemon(@PathVariable String pokemonName){
        service.deletePokemonByName(pokemonName);
        return ResponseEntity.noContent().build();
    }
}
