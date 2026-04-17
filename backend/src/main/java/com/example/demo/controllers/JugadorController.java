package com.example.demo.controllers;

import com.example.demo.models.Jugador;
import com.example.demo.repositories.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jugadores")
@CrossOrigin(origins = "http://localhost:4321") // Esto permite que tu Astro (puerto 4321) hable con Java
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    // GET: http://localhost:8080/api/jugadores
    @GetMapping
    public List<Jugador> obtenerTodos() {
        return jugadorRepository.findAll();
    }

    // POST: Para guardar un jugador nuevo
    @PostMapping
    public Jugador crearJugador(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }
}