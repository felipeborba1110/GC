package com.pokemon.pokedex.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PokeApiResponse(
        int count,
        String next,
        String previous,
        List<PokeApiPokemon> results
) {}
