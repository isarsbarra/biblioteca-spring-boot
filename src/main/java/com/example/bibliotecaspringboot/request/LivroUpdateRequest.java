package com.example.bibliotecaspringboot.request;

import lombok.Data;

@Data
public class LivroUpdateRequest {

    private Long id;
    private String nome;
    private String autor;
}
