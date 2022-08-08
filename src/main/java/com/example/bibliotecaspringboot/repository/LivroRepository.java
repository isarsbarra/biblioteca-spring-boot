package com.example.bibliotecaspringboot.repository;

import com.example.bibliotecaspringboot.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    List<Livro> findByOrderByNomeAsc();

}
