package com.pokemon.pokedex.services;

import com.pokemon.pokedex.entities.Pokemon;
import com.pokemon.pokedex.repositories.PokedexRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PokedexService {
    private final PokedexRepository repository;

    public List<Pokemon> listPokemons() {
        return repository.list();
    }

    public Pokemon findPokemonByName(String pokemonName){
        return repository.get(pokemonName);
    }

    public void addPokemon(Pokemon pokemon){
        if (findPokemonByName(pokemon.getName()) == null){
            repository.save(pokemon);
        }
    }

    public void editPokemon(Pokemon newPokemon, Pokemon oldPokemon){
        repository.edit(newPokemon,oldPokemon);
    }

    public void deletePokemon(Pokemon pokemon){
        repository.delete(pokemon);
    }
}
