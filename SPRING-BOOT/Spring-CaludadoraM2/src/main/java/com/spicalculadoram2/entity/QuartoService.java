package com.spicalculadoram2.entity;

import com.spicalculadoram2.model.Imovel;
import com.spicalculadoram2.model.Quarto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class QuartoService {
    private static List<Quarto> listaDeQuartos = new ArrayList<>();

    public QuartoService() {

    }

    public Quarto comparaQuartos(Imovel imovel) {
        listaDeQuartos = imovel.getQuartoList();
        for (Quarto quarto : listaDeQuartos) {
            quarto.setTamanho(quarto.getComprimento() * quarto.getLargura());
        }
        return listaDeQuartos.stream().max(Comparator.comparing(Quarto::getTamanho)).get();
    }
}
