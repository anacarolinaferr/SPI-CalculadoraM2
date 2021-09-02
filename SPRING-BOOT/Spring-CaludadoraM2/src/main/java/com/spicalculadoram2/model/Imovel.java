package com.spicalculadoram2.model;

import lombok.Data;

import java.util.List;

@Data
public class Imovel {
    private Long id;
    private String nome;
    private String endereco;
    private Double tamanho;
    private List<Quarto> quartoList;

    public Imovel(String nome, String endereco, Double tamanho) {
        this.nome = nome;
        this.endereco = endereco;
        this.tamanho = tamanho;
    }

    public Imovel(String nome, String endereco, Double tamanho, List<Quarto> quartoList) {
        this.nome = nome;
        this.endereco = endereco;
        this.tamanho = tamanho;
        this.quartoList = quartoList;
    }
}
