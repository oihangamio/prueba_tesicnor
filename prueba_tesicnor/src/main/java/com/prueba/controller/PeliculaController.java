package com.prueba.controller;

import com.prueba.model.Pelicula;
import com.prueba.repository.PeliculaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController {

    private final PeliculaRepository peliculaRepository;

    public PeliculaController(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    @GetMapping
    public List<Pelicula> getAllPeliculas() {
        System.out.println(peliculaRepository);
        return (List<Pelicula>) peliculaRepository.findAll();
    }
}
