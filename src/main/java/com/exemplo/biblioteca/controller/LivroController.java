package com.exemplo.biblioteca.controller;

import com.exemplo.biblioteca.model.Livro;
import com.exemplo.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public Iterable<Livro> listar() {
        return livroRepository.findAll();
    }

    @PostMapping
    public Livro salvar(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }
}
