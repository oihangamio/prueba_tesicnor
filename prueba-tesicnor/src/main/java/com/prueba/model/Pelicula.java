package com.prueba.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    private Long id;

    private String imdbID;
    private String title;
    private Long year;
    private String plot;

}