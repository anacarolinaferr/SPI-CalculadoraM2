package com.spicalculadoram2.dto;

import com.spicalculadoram2.model.Imovel;
import lombok.Data;

import java.io.Serializable;

@Data
public class ImovelDto implements Serializable {

    private String nome;
    private String endereco;
    private Double tamanho;

    public ImovelDto(String nome, String endereco, Double tamanho) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.tamanho = tamanho;
    }

    public Imovel converte() {
        Imovel imovel = new Imovel(this.nome, this.endereco, this.tamanho);
        return imovel;
    }

    public static ImovelDto converte(Imovel imovel) {
        ImovelDto imovelDto = new ImovelDto(imovel.getNome(), imovel.getEndereco(), imovel.getTamanho());
        return imovelDto;
    }
}
