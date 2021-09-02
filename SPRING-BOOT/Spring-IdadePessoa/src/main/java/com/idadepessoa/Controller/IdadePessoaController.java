package com.idadepessoa.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@RestController
public class IdadePessoaController {

    @GetMapping("/idade")
    public Long retornaIdade(@RequestParam Integer dia, @RequestParam Integer mes, @RequestParam Integer ano){

        LocalDate dataCadastro = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();

        long idade = dataCadastro.until(hoje, ChronoUnit.YEARS);

        return idade;
    }

    @GetMapping("/{dia}/{mes}/{ano}")
    public Long retornaIdade2(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer ano){

        LocalDate dataCadastro = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();

        Long idade = dataCadastro.until(hoje, ChronoUnit.YEARS);

        return idade;
    }
}
