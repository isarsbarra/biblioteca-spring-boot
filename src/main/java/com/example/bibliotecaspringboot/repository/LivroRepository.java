package com.example.bibliotecaspringboot.repository;

import com.example.bibliotecaspringboot.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
