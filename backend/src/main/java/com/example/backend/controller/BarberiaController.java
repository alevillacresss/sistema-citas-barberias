package com.example.backend.controller;

import com.example.backend.model.Barberia;
import com.example.backend.repository.BarberiaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/barberias")
public class BarberiaController {
    private final BarberiaRepository repo;
    public BarberiaController(BarberiaRepository repo) { this.repo = repo; }

    @GetMapping public List<Barberia> listar() { return repo.findAll(); }
    @PostMapping public Barberia crear(@RequestBody Barberia b) { return repo.save(b); }
}
