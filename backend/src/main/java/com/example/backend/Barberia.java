package com.example.backend.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "barberia")
public class Barberia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private String direccion;
    private String telefono;

    @OneToMany(mappedBy = "barberia", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Barbero> barberos;

    // getters y setters
}
