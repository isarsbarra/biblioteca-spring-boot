package com.example.bibliotecaspringboot.converter;

import com.example.bibliotecaspringboot.model.Livro;
import com.example.bibliotecaspringboot.request.LivroRequest;
import org.springframework.stereotype.Component;

@Component
public class LivroConverter {

    public Livro convertToLivro(LivroRequest livroRequest){
        Livro livro = new Livro();
        livro.setNome(livroRequest.getNome());
        livro.setAutor(livroRequest.getAutor());
        return livro;
    }
}
