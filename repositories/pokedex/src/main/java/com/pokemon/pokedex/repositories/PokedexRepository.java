package com.pokemon.pokedex.repositories;

import com.pokemon.pokedex.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface PokedexRepository extends JpaRepository<Pokemon, Integer>, CrudRepository<Pokemon, Integer> {
    Pokemon findByName(String name);
}
