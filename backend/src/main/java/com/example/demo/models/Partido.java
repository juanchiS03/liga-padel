package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "pareja1_id")
    private Pareja parejaLocal;

    @ManyToOne
    @JoinColumn(name = "pareja2_id")
    private Pareja parejaVisitante;

    private LocalDateTime fechaHora;
    private String resultado; // Ejemplo: "6-4, 3-6, 7-6"
    private boolean jugado; // Indica si el partido ya se ha jugado o no
}
