package com.example.bibliotecaspringboot.service;

import com.example.bibliotecaspringboot.bo.LivroBusinessObject;
import com.example.bibliotecaspringboot.exception.LivroException;
import com.example.bibliotecaspringboot.model.Livro;
import com.example.bibliotecaspringboot.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroBusinessObject livroBusinessObject;

    @Autowired
    private LivroRepository livroRepository;
    public Livro save(Livro livro) {
        livroBusinessObject.validaLivro(livro);
        Livro livroSalvo = livroRepository.save(livro);
        return livroSalvo;
    }

    public List<Livro> findAll() {
        return livroRepository.findByOrderByNomeAsc();
    }

    public Livro findById(Long id) {
        return livroRepository.findById(id)
                .orElseThrow(() -> new LivroException("Livro não encontrado para o id: " + id));
    }

    public Livro update(Livro livro) {
        return livroRepository.save(livro);
    }

    public void delete(Long id) {
        livroRepository.deleteById(id);
    }
}
