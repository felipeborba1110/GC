package com.pokemon.pokedex.repositories;

import com.pokemon.pokedex.entities.Pokemon;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PokedexRepository {
    private List<Pokemon> pokemons;

    public List<Pokemon> list() {
        return List.copyOf(pokemons);
    }

    public Pokemon get(String pokemonName){
        for(Pokemon pokemon : pokemons){
            if(pokemon.name().equalsIgnoreCase(pokemonName)){
                return pokemon;
            }
        }
        return null;
    }

    public void save(Pokemon pokemon){
        pokemons.add(pokemon);
    }

    public void edit(Pokemon newPokemon, Pokemon oldPokemon){
        pokemons.set((pokemons.indexOf(oldPokemon)),newPokemon);
    }

    public void delete(Pokemon pokemon){
        pokemons.remove(pokemon);
    }
}
