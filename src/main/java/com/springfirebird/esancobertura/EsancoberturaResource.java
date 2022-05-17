package com.springfirebird.esancobertura;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coberturas")
public class EsancoberturaResource {

    @Autowired
    private EsancoberturaService service;

    @GetMapping("/{id}")
    public Esancobertura get(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/matriz/{id}")
    public List<Esancobertura> findByIdMatriz(@PathVariable Integer id) {
        return service.findAllByCodMatriz(id);
    }
}
