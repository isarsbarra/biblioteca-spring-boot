package com.example.bibliotecaspringboot.bo;

import com.example.bibliotecaspringboot.exception.LivroException;
import com.example.bibliotecaspringboot.model.Livro;
import org.springframework.stereotype.Component;

@Component
public class LivroBusinessObject {

    public void validaLivro(Livro livro){
        if(livro.getNome().isEmpty()){
            throw new LivroException("Nome vazio!");
        }
    }
}
