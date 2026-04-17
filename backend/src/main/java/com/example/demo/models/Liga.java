package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
public class Liga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String temporada; // Ej: "Primavera 2026"

    @OneToMany
    private List<Pareja> parejas;

    @OneToMany
    private List<Partido> partidos;
}