package com.example.bibliotecaspringboot.converter;

import com.example.bibliotecaspringboot.model.Livro;
import com.example.bibliotecaspringboot.request.LivroSaveRequest;
import com.example.bibliotecaspringboot.request.LivroUpdateRequest;
import com.example.bibliotecaspringboot.response.LivroResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LivroConverter {

    public Livro convertToLivro(LivroSaveRequest livroSaveRequest){
        Livro livro = new Livro();
        livro.setNome(livroSaveRequest.getNome());
        livro.setAutor(livroSaveRequest.getAutor());
        return livro;
    }

    public Livro convertToLivro(LivroUpdateRequest livroUpdateRequest){
        Livro livro = new Livro();
        livro.setId(livroUpdateRequest.getId());
        livro.setNome(livroUpdateRequest.getNome());
        livro.setAutor(livroUpdateRequest.getAutor());
        return livro;
    }

    public LivroResponse convertToLivroResponse(Livro livro){
        LivroResponse livroResponse = new LivroResponse();
        livroResponse.setId(livro.getId());
        livroResponse.setNome(livro.getNome());
        livroResponse.setAutor(livro.getAutor());
        return livroResponse;
    }

    public List<LivroResponse> convertToListLivroResponse(List<Livro> livros) {

//        List<LivroResponse> livrosResponse = livros.stream().map(livro -> {
//            LivroResponse livroResponse = new LivroResponse();
//            livroResponse.setId(livro.getId());
//            livroResponse.setNome(livro.getNome());
//            livroResponse.setAutor(livro.getAutor());
//            return livroResponse;
//        }).collect(Collectors.toList());

        List<LivroResponse> livrosResponse = livros
                .stream()
                .map(this::convertToLivroResponse)
                .collect(Collectors.toList());
        return livrosResponse;
    }

}
