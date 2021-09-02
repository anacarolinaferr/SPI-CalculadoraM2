package com.example.springteste.model;

import lombok.Data;

@Data
public class Disciplina {

    private String codigo;
    private String nome;

    public Disciplina() {
        //this.setCodigo();
    }

    public Disciplina(String nome) {
        this.nome = nome;
    }
}
