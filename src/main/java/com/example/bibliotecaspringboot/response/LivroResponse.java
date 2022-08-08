package com.example.bibliotecaspringboot.response;

import lombok.Data;

@Data
public class LivroResponse {

    private Long id;
    private String nome;
    private String autor;
}
