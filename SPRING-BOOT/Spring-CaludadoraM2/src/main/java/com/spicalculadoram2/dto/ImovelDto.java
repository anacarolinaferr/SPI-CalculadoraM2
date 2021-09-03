package com.spicalculadoram2.dto;

import com.spicalculadoram2.model.Imovel;
import com.spicalculadoram2.model.Quarto;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ImovelDto implements Serializable {

    private String nome;
    private String endereco;
    private Double tamanho;
    private List<Quarto> quartoList;

    public ImovelDto(String nome, String endereco, Double tamanho, List<Quarto> quartoList) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.tamanho = tamanho;
        this.quartoList = quartoList;
    }

    public Imovel converte() {
        Imovel imovel = new Imovel(this.nome, this.endereco, this.tamanho, this.quartoList);
        return imovel;
    }

    public static ImovelDto converte(Imovel imovel) {
        ImovelDto imovelDto = new ImovelDto(imovel.getNome(), imovel.getEndereco(), imovel.getTamanho(), imovel.getQuartoList());
        return imovelDto;
    }
}
