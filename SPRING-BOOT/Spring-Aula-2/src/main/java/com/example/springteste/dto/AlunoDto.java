package com.example.springteste.dto;

import com.example.springteste.model.Aluno;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class AlunoDto implements Serializable {
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;

    public AlunoDto(String nome, String sexo, LocalDate dataNascimento) {
        super();
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

    public Aluno converte() {
        Aluno aluno = new Aluno(this.nome, this.sexo, this.dataNascimento);
        return aluno;
    }

    public static AlunoDto converte(Aluno aluno) {
        AlunoDto alunoDto = new AlunoDto(aluno.getNome(), aluno.getSexo(), aluno.getDataNascimento());
        return alunoDto;
    }
}
