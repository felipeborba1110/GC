package com.pokemon.pokedex.controllers;

import com.pokemon.pokedex.entities.Pokemon;
import com.pokemon.pokedex.services.PokedexService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokedex")
@AllArgsConstructor
public class PokedexController {
    private PokedexService service;

    @GetMapping("/list")
    public List<Pokemon> listarPokemons(){
        return service.listPokemons();
    }

    @GetMapping("/pokemon/{pokemon_name}")
    public Pokemon procurarPokemon(@PathVariable String pokemonName){
        Pokemon pokemon = service.findPokemonByName(pokemonName);
        if (pokemon != null){
            return pokemon;
        } else {
            System.out.println("Pokemon não encontrado");
            return null;
        }
    }

    @PostMapping("/pokemon")
    public void criarPokemon(int id, String name){
        service.addPokemon(id,name);
    }

    @PutMapping("/pokemon/{pokemon_name}")
    public void editarPokemon(int id, String name, @PathVariable String pokemonName){
        Pokemon pokemon = procurarPokemon(pokemonName);
        if (pokemon != null){
            service.editPokemon(id,name,pokemon);
        }
    }

    @DeleteMapping("/pokemon/{pokemon_name}")
    public void deletarPokemon(@PathVariable String pokemonName){
        Pokemon pokemon = procurarPokemon(pokemonName);
        if (pokemon != null){
            service.deletePokemon(pokemon);
        }
    }
}
