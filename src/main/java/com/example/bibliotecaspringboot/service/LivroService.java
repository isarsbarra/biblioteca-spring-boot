package com.example.bibliotecaspringboot.service;

import com.example.bibliotecaspringboot.model.Livro;
import com.example.bibliotecaspringboot.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;
    public Livro save(Livro livro) {
        Livro livroSalvo = livroRepository.save(livro);
        return livroSalvo;
    }

    public List<Livro> findAll() {
        return livroRepository.findAll();
    }

    public Livro findById(Long id) {
        return livroRepository.findById(id).get();
    }

    public Livro update(Livro livro) {
        return livroRepository.save(livro);
    }
}
