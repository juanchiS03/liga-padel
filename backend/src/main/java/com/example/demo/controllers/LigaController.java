package com.example.demo.controllers;

import com.example.demo.models.Liga;
import com.example.demo.repositories.LigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    
@RestController
@RequestMapping("/api/ligas")
@CrossOrigin(origins = "http://localhost:4321")
public class LigaController {
    
    @Autowired
    private LigaRepository ligaRepository;

    // GET: http://localhost:8080/api/ligas
    @GetMapping
    public List<Liga> obtenerTodas() {
        return ligaRepository.findAll(); // Aquí deberías usar un repositorio de Liga, no de Pareja
    }

    // POST: Para guardar una liga nueva
    @PostMapping
    public Liga crearLiga(@RequestBody Liga liga) {
        return ligaRepository.save(liga); // Aquí también deberías usar un repositorio de Liga
    }
}
