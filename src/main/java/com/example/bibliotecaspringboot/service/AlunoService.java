package com.example.bibliotecaspringboot.service;

import com.example.bibliotecaspringboot.model.Aluno;
import com.example.bibliotecaspringboot.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;
    public Aluno save(Aluno aluno) {

        Aluno alunoSalvo = alunoRepository.save(aluno);
        return alunoSalvo;
    }

    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }
}

