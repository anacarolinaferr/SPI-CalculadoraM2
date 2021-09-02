package com.spicalculadoram2.controller;

import com.spicalculadoram2.dto.ImovelDto;
import com.spicalculadoram2.entity.ImovelService;
import com.spicalculadoram2.model.Imovel;
import com.spicalculadoram2.model.Quarto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/imovel")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    @PostMapping("/cadastra")
    public ResponseEntity<ImovelDto> cadastraImovel(@RequestBody ImovelDto imovelDto, UriComponentsBuilder uriBuilder) {
        Imovel imovel = imovelDto.converte();
        Imovel imovelCadastrado = imovelService.cadastra(imovel);

        URI uri = uriBuilder.path("/imovel/{id}").buildAndExpand(imovelCadastrado.getId()).toUri();
        return ResponseEntity.created(uri).body(ImovelDto.converte(imovelCadastrado));
    }

    @GetMapping("/{id}")
    public ImovelDto obtemImovel(@PathVariable("id") Long id) {
        Imovel imovel = imovelService.get(id);
        ImovelDto dto = null;
        if (imovel != null) {
            dto = ImovelDto.converte(imovel);
        }
        return dto;
    }

    @GetMapping("/tamanho/{id}")
    public Double obtemTamanhoImovel(@PathVariable("id") Long id) {
        Imovel imovel = imovelService.get(id);
        ImovelDto dto = null;
        if (imovel != null) {
            dto = ImovelDto.converte(imovel);
        }
        return dto.getTamanho();
    }

    @GetMapping("/valor/{id}")
    public Double obtemValorImovel(@PathVariable("id") Long id) {
        return imovelService.getValor(id);
    }

    @GetMapping("/maiorquarto/{id}")
    public Quarto maiorQuarto(@PathVariable("id") Long id) {
        return imovelService.obtemMaiorQuarto(id);
    }


}
