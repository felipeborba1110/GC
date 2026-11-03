package com.pokemon.pokedex.services;

import com.pokemon.pokedex.dtos.PokemonDTO;
import com.pokemon.pokedex.entities.Pokemon;
import com.pokemon.pokedex.exceptions.ResourceNotFoundException;
import com.pokemon.pokedex.repositories.PokedexRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PokedexService {
    private final PokedexRepository repository;

    public List<PokemonDTO> listPokemons() {
        List<PokemonDTO> pokeDTO = new ArrayList<>();
        for(Pokemon pokemon : repository.findAll()){
            pokeDTO.add(new PokemonDTO(pokemon.getId(),pokemon.getName()));
        }
        return pokeDTO;
    }

    public PokemonDTO findPokemonByName(String pokemonName){
        try {
            Pokemon pokemon = repository.findByName(pokemonName);
            return new PokemonDTO(pokemon.getId(),pokemon.getName());
        } catch(NullPointerException exception) {
            throw new ResourceNotFoundException("Pokemon não existe no sistema");
        }
    }

    public void addPokemon(PokemonDTO pokemon){
        try{
            findPokemonByName(pokemon.name());
            throw new ResourceNotFoundException("Pokemon já existe no sistema");
        } catch (NullPointerException exception){
            repository.save(new Pokemon(pokemon.id(), pokemon.name()));
        }
    }

    public void editPokemon(PokemonDTO newPokemon, String oldPokemonName){
        try{
            PokemonDTO oldPokemon = findPokemonByName(oldPokemonName);

            repository.delete(new Pokemon(oldPokemon.id(), oldPokemon.name()));
            repository.save(new Pokemon(newPokemon.id(), newPokemon.name()));
        } catch(NullPointerException exception){
            throw new ResourceNotFoundException("Pokemon não existe no sistema");
        }

    }

    public void deletePokemonByName(String pokemonName){
        try{
            PokemonDTO pokemon = findPokemonByName(pokemonName);

            repository.delete(new Pokemon(pokemon.id(), pokemon.name()));
        } catch(NullPointerException exception){
            throw new ResourceNotFoundException("Pokemon não existe no sistema");
        }
    }
}
