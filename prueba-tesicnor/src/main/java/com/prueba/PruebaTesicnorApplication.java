package com.prueba;

import ch.qos.logback.classic.Logger;
import com.prueba.repository.PeliculaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class PruebaTesicnorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaTesicnorApplication.class, args);
	}

	@Autowired
	private PeliculaRepository peliculaRepository;

	@Bean
	CommandLineRunner init(){
		return args -> {
			peliculaRepository.findAll().forEach(pelicula -> {
				log.info(pelicula.getTitle());
			});
		};
	}

}
