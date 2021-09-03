package com.springaula0309.entity;

import com.springaula0309.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    private static List<Aluno> listaAlunos = new ArrayList<Aluno>();

    public Aluno cadastra(Aluno aluno){
        listaAlunos.add(aluno);
        Long idAluno = (long) listaAlunos.size();
        aluno.setId(idAluno);
        return aluno;
    }

    public List<Aluno> listarAlunos(){
        return AlunoService.listaAlunos;
    }

    public Aluno getAluno(long id){
        for(Aluno aluno: listaAlunos){
            if(aluno.getId().equals(id)){
                return aluno;
            }
        }
        return null;
    }
}
