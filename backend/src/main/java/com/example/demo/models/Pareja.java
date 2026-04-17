package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pareja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "jugador1_id")
    private Jugador jugador1;

    @ManyToOne
    @JoinColumn(name = "jugador2_id")
    private Jugador jugador2;

    private Integer puntosTotales;
    private Integer partidosGanados;
}
