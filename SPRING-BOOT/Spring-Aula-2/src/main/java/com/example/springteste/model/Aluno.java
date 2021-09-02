package com.example.springteste.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Aluno {
    private Long id;
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;
    private String senha;

    public Aluno() {
        this.senha = String.valueOf(Long.MAX_VALUE);
    }

    public Aluno(String nome, String sexo, LocalDate dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
