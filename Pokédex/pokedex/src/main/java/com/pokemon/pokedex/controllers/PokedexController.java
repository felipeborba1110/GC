package com.pokemon.pokedex.controllers;

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
    public ResponseEntity<List<Pokemon>> listarPokemons() {
        return ResponseEntity.ok(service.listPokemons());
    }

    @GetMapping("/pokemon/{pokemonName}")
    public ResponseEntity<Pokemon> procurarPokemon(@PathVariable String pokemonName){
        Pokemon pokemon = service.findPokemonByName(pokemonName);
        if (pokemon != null){
            return ResponseEntity.ok(pokemon);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/pokemon")
    public ResponseEntity<Pokemon> criarPokemon(@RequestBody Pokemon pokemon){
        service.addPokemon(pokemon);
        return ResponseEntity.status(HttpStatus.CREATED).body(pokemon);
    }

    @PutMapping("/pokemon/{pokemonName}")
    public ResponseEntity<Pokemon> editarPokemon(@RequestBody Pokemon newPokemon, @PathVariable String pokemonName){
        Pokemon oldPokemon = service.findPokemonByName(pokemonName);
        if (oldPokemon != null){
            service.editPokemon(newPokemon,oldPokemon);
            return ResponseEntity.ok(newPokemon);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/pokemon/{pokemonName}")
    public ResponseEntity<Void> deletarPokemon(@PathVariable String pokemonName){
        Pokemon pokemon = service.findPokemonByName(pokemonName);
        if (pokemon != null){
            service.deletePokemon(pokemon);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
