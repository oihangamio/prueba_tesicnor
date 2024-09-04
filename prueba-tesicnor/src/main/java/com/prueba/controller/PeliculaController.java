package com.prueba.controller;

import com.prueba.model.Pelicula;
import com.prueba.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaRepository peliculaRepository;

    @GetMapping
    public List<Pelicula> getAllPeliculas() {
        return (List<Pelicula>) peliculaRepository.findAll();
    }
}

