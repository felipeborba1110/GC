package com.pokemon.pokedex.services;

import com.pokemon.pokedex.entities.Pokemon;
import com.pokemon.pokedex.repositories.PokedexRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PokedexService {
    @Autowired
    private final PokedexRepository repository;

    public List<Pokemon> listPokemons() {
        return repository.list();
    }

    public Pokemon findPokemonByName(String pokemonName){
        return repository.get(pokemonName);
    }

    public void addPokemon(int id, String name){
        repository.save(new Pokemon(id,name));
    }

    public void editPokemon(int id, String name, Pokemon pokemon){
        repository.edit(new Pokemon(id,name),pokemon);
    }

    public void deletePokemon(Pokemon pokemon){
        repository.delete(pokemon);
    }
}
