package com.example.springteste.controllers;

import com.example.springteste.model.Disciplina;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DisciplinaController {

    @RequestMapping(value = "cadastra/disciplina", method = RequestMethod.POST)
    public Disciplina cadastro(@RequestBody Disciplina disciplina) {
        return disciplina;
    }
}
