package com.spicalculadoram2.entity;

import com.spicalculadoram2.dto.QuartoDto;
import com.spicalculadoram2.model.Imovel;
import com.spicalculadoram2.model.Quarto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImovelService {

    private static List<Imovel> listaDeImoveis = new ArrayList<Imovel>();

    public ImovelService() {

    }

    public Imovel cadastra(Imovel imovel) {
        listaDeImoveis.add(imovel);
        Long idImovel = (long) listaDeImoveis.size();
        imovel.setId(idImovel);
        return imovel;
    }

    public Imovel get(Long id) {
        for (Imovel imovel : listaDeImoveis) {
            if (imovel.getId().equals(id)) {
                return imovel;
            }
        }
        return null;
    }

    public Double getValor(Long id) {
        for (Imovel imovel : listaDeImoveis) {
            if (imovel.getId().equals(id)) {
                return imovel.getTamanho() * 800d;
            }
        }
        return null;
    }

    public Quarto obtemMaiorQuarto(Long id) {
        QuartoService quartoServices = new QuartoService();
        for (Imovel imovel : listaDeImoveis) {
            if (imovel.getId().equals(id)) {
                return quartoServices.comparaQuartos(imovel);
            }
        }
        return null;
    }

    public List<Quarto> obtemMetragemByQuartos(Long id) {
        QuartoService quartoServices = new QuartoService();
        for (Imovel imovel : listaDeImoveis) {
            if (imovel.getId().equals(id)) {
                return quartoServices.metragemQuartos(imovel);
            }
        }
        return null;
    }
}
