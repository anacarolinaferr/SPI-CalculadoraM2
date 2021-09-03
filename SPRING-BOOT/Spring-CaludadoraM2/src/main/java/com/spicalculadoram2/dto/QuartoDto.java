package com.spicalculadoram2.dto;

import com.spicalculadoram2.model.Quarto;

import java.io.Serializable;

public class QuartoDto implements Serializable {

    private String nome;
    private Double metragem;

    public QuartoDto(String nome, Double metragem) {
        this.nome = nome;
        this.metragem = metragem;
    }

    public Quarto converte() {
        Quarto quarto = new Quarto(this.nome, this.metragem);
        return quarto;
    }

    public static QuartoDto converte(Quarto quarto) {
        QuartoDto quartoDto = new QuartoDto(quarto.getNome(), quarto.getMetragem());
        return quartoDto;
    }
}
