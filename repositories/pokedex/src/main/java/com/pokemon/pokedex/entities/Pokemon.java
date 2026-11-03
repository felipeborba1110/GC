package com.pokemon.pokedex.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Table(name="pokemon")
@Entity
@Getter
@Setter
public class Pokemon{
    @Id
    private Integer id;
    private String name;
}
