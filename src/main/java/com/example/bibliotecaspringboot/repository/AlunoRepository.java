package com.example.bibliotecaspringboot.repository;

import com.example.bibliotecaspringboot.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
