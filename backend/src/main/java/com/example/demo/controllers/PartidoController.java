package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.models.Partido;
import com.example.demo.repositories.PartidoRepository;

@RestController
@RequestMapping("/api/partidos")
@CrossOrigin(origins = "http://localhost:4321") // Esto permite que tu Astro (puerto 4321) hable con Java
public class PartidoController {
    
    @Autowired
    private PartidoRepository partidoRepository;

    @GetMapping
    public List<Partido> obtenerTodos() {
        return partidoRepository.findAll(); // Por ahora solo devuelve un mensaje, luego deberías devolver la lista de partidos
    }

    @PostMapping
    public Partido crearPartido(@RequestBody Partido partido) {
        return partidoRepository.save(partido); // Aquí deberías guardar el partido en la base de datos
    }

    // Un PUT para cuando quieras actualizar el resultado del partido
    @PutMapping("/{id}")
    public Partido actualizarResultado(@PathVariable Long id, @RequestBody Partido partidoActualizado) {
        return partidoRepository.findById(id)
                .map(partido -> {
                    partido.setResultado(partidoActualizado.getResultado());
                    partido.setJugado(true);
                    return partidoRepository.save(partido);
                }).orElseThrow();
    }
}
