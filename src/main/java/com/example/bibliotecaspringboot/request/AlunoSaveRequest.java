package com.example.bibliotecaspringboot.request;

import com.example.bibliotecaspringboot.enumeracao.TipoMatriculaEnum;
import lombok.Data;

@Data
public class AlunoSaveRequest {

    private String nome;
    private int idade;
    private TipoMatriculaEnum tipoMatricula;

}
