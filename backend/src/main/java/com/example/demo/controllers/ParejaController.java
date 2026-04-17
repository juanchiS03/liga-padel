package com.example.demo.controllers;

import com.example.demo.models.Pareja;
import com.example.demo.repositories.ParejaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parejas")
@CrossOrigin(origins = "http://localhost:4321") // Esto permite que tu Astro (puerto 4321) hable con Java
public class ParejaController {

    @Autowired
    private ParejaRepository parejaRepository;

    // GET: http://localhost:8080/api/parejas
    @GetMapping
    public List<Pareja> obtenerTodas() {
        return parejaRepository.findAll();
    }

    // POST: Para guardar una pareja nueva
    @PostMapping
    public Pareja crearPareja(@RequestBody Pareja pareja) {
        return parejaRepository.save(pareja);
    }
}