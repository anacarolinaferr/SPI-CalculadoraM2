package com.spicalculadoram2.model;

import lombok.Data;

@Data
public class Quarto {
    private String nome;
    private Double largura;
    private Double comprimento;
    private Double tamanho;
    private Double metragem;

    public Quarto(String nome, Double metragem) {
        this.nome = nome;
        this.metragem = metragem;
    }
}
