package com.exemplo.biblioteca.controller;

import com.exemplo.biblioteca.model.Categoria;
import com.exemplo.biblioteca.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public Iterable<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @PostMapping
    public Categoria salvar(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
