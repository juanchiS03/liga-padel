package com.example.demo.repositories;

import com.example.demo.models.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {
    // Al extender de JpaRepository, ya tienes: save(), findAll(), findById(), delete()... 
    // ¡Sin escribir una sola línea de lógica!
}
