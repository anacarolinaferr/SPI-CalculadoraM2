package com.example.springteste.entity;

import com.example.springteste.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    private static List<Aluno> listaDeAlunos = new ArrayList<Aluno>();

    public AlunoService() {
    }


    public Aluno cadastra(Aluno aluno) {
        listaDeAlunos.add(aluno);
        Long idAluno = (long) listaDeAlunos.size();
        aluno.setId(idAluno);

        return aluno;
    }

    public List<Aluno> listaDeAlunos() {
        return AlunoService.listaDeAlunos;
    }

    public Aluno get(Long id) {
        for (Aluno aluno : listaDeAlunos) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
        }
        return null;
    }
}
