
package com.pokemon.pokedex.clients;

import com.pokemon.pokedex.entities.PokeApiPokemon;
import com.pokemon.pokedex.entities.PokeApiResponse;
import com.pokemon.pokedex.entities.Pokemon;
import com.pokemon.pokedex.repositories.PokedexRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class PokeApiClient implements CommandLineRunner {

    private final PokedexRepository repository;

    private final RestClient restClient = RestClient.create();

    private static final String API_URL =
            "https://pokeapi.co/api/v2/pokemon?limit=50";

    @Override
    public void run(String... args) {

        PokeApiResponse response = restClient.get()
                .uri(API_URL)
                .retrieve()
                .body(PokeApiResponse.class);

        if (response == null || response.results() == null) {
            throw new IllegalStateException(
                    "Não foi possível obter os Pokémon da PokéAPI."
            );
        }

        ArrayList<Pokemon> pokemons = new ArrayList<>();

        for (PokeApiPokemon result : response.results()) {
            int id = extractId(result.url());

            Pokemon pokemon = new Pokemon(id, result.name());

            pokemons.add(pokemon);
        }

        for (Pokemon pokemon : pokemons) {
            repository.save(pokemon);
        }

        System.out.println(
                pokemons.size() + " Pokémon carregados no repositório."
        );
    }

    private int extractId(String url) {
        String path = URI.create(url).getPath();
        String[] parts = path.split("/");

        return Integer.parseInt(parts[parts.length - 1]);
    }

}
