package com.example.backend.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "barbero")
public class Barbero {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;
    private String telefono;
    private String email;

    @ManyToOne
    @JoinColumn(name = "barberia_id")
    private Barberia barberia;

    @OneToMany(mappedBy = "barbero", cascade = CascadeType.ALL)
    private List<Cita> citas;

    // getters y setters
}
