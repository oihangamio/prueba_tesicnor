package com.prueba.prueba_tesicnor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.annotation.AccessType;


@Entity
@AccessType(AccessType.Type.FIELD)
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long imdbId;
    private String title;
    private Long year;
    private String plot;

    public void setId(Long id) {
        this.id = id;
    }

    public void setImdbId(Long imdbId) {
        this.imdbId = imdbId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

}
