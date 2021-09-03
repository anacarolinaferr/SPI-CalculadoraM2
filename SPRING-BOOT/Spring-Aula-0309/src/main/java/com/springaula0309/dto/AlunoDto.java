package com.springaula0309.dto;

import com.springaula0309.model.Aluno;
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
        return "AlunoDto{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }

    public Aluno converteParaAluno(){
        Aluno aluno = new Aluno(this.nome,this.sexo,this.dataNascimento);
        return aluno;
    }

    public static AlunoDto converteParaAlunoDto(Aluno aluno){
        AlunoDto alunoDto = new AlunoDto(aluno.getNome(),aluno.getSexo(),aluno.getDataNascimento());
        return alunoDto;
    }
}
