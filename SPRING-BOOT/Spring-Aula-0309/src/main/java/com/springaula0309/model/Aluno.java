package com.springaula0309.model;

import lombok.Data;
import java.time.LocalDate;

@Data
public class Aluno {
    private Long id;
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;

    public Aluno() {
    }

    public Aluno(String nome, String sexo, LocalDate dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
