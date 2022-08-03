package com.example.bibliotecaspringboot.controller;

import com.example.bibliotecaspringboot.converter.LivroConverter;
import com.example.bibliotecaspringboot.model.Livro;
import com.example.bibliotecaspringboot.request.LivroRequest;
import com.example.bibliotecaspringboot.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @Autowired
    private LivroConverter livroConverter;

    @PostMapping
    public Livro save(@RequestBody LivroRequest livroRequest){
        Livro livro = livroConverter.convertToLivro(livroRequest);
        Livro livroSalvo = livroService.save(livro);
        return livroSalvo;
    }

    @PutMapping
    public Livro update(@RequestBody Livro livro){
        Livro livroAlterado = livroService.update(livro);
        return livroAlterado;
    }

    @GetMapping
    public List<Livro> findAll(){
        List<Livro> livros = livroService.findAll();
        return livros;
    }

    @GetMapping("/{id}")
    public Livro findById(@PathVariable("id") Long id){
        Livro livro = livroService.findById(id);
        return livro;
    }
}
