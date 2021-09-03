package com.springaula0309.controller;

import com.springaula0309.dto.AlunoDto;
import com.springaula0309.entity.AlunoService;
import com.springaula0309.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping("/cadastra")
    public ResponseEntity<AlunoDto> cadastraAluno(@RequestBody AlunoDto alunoDto, UriComponentsBuilder uriBuilder ){
        Aluno aluno = alunoDto.converteParaAluno();
        Aluno alunoCadastrado = alunoService.cadastra(aluno);

        URI uri = uriBuilder.path("/aluno/{id}").buildAndExpand(alunoCadastrado.getId()).toUri();
        return ResponseEntity.created(uri).body(AlunoDto.converteParaAlunoDto(alunoCadastrado));
    }

    @GetMapping("/{id}")
    public Aluno getAlunobyId(@PathVariable("id") Long id){
        Aluno aluno = alunoService.getAluno(id);
        return aluno;
    }

}
