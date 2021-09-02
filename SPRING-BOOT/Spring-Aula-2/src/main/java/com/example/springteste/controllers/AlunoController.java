package com.example.springteste.controllers;

import com.example.springteste.dto.AlunoDto;
import com.example.springteste.entity.AlunoService;
import com.example.springteste.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService; //injecao de dependencia + inversao de controller

    @PostMapping("/cadastra")
    public ResponseEntity<AlunoDto> cadastraAluno(@RequestBody AlunoDto alunoDto, UriComponentsBuilder uriBuilder) {
        Aluno aluno = alunoDto.converte();
        Aluno alunoCadastrado = alunoService.cadastra(aluno);

        URI uri = uriBuilder.path("/aluno/{id}").buildAndExpand(alunoCadastrado.getId()).toUri();
        return ResponseEntity.created(uri).body(AlunoDto.converte(alunoCadastrado));
    }

    @GetMapping("/{id}")
    public AlunoDto obtemAluno(@PathVariable("id") Long id) {
        Aluno aluno = alunoService.get(id);
        AlunoDto dto = null;
        if (aluno != null) {
            dto = AlunoDto.converte(aluno);
        }
        return dto;
    }
}
