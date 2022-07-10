/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.efablancamentoracao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lancamento_racoes")
public class EfablancamentoracaoResource {

    @Autowired
    private EfablancamentoracaoService service;

    @GetMapping()
    public List<Efablancamentoracao> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Efablancamentoracao get(@PathVariable Integer id) {
        return service.findById(id);
    }

}
