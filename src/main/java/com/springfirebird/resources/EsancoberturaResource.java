/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.resources;

import com.springfirebird.model.entities.Esancobertura;
import com.springfirebird.model.services.EsancoberturaService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Juliano
 */
@RestController
@RequestMapping("/coberturas")
public class EsancoberturaResource {

    @Autowired
    private EsancoberturaService service;

    @GetMapping()
    public List<Esancobertura> list() {
        return null;
    }

    @GetMapping("/{id}")
    public List<Esancobertura> get(@PathVariable Integer id) {
        return service.findAllByCodMatriz(id);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Esancobertura input) {
//        return null;
//    }
//
//    @PostMapping
//    public ResponseEntity<?> post(@RequestBody Esancobertura input) {
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable String id) {
//        return null;
//    }
}
