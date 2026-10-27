package com.pokemon.pokedex.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PokeApiPokemon(
        String name,
        String url
) {}
