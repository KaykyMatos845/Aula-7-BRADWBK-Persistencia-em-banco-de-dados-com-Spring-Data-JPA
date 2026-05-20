package com.exemplo.biblioteca.repository;

import com.exemplo.biblioteca.model.Livro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Long> {
}
