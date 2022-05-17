/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.esanmovmaternidade;

import com.springfirebird.esanmovmaternidade.Esanmovmaternidade;
import com.springfirebird.esanmovmaternidade.EsanmovmaternidadeService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author Juliano
 */
@RestController
@RequestMapping("/movmaternidade")
public class EsanmovmaternidadeResource {

    @Autowired
    private EsanmovmaternidadeService service;

    @GetMapping()
    public List<Esanmovmaternidade> list() {
        return null;
    }

    @GetMapping("/{cdmatriz}")
    public List<Esanmovmaternidade> findByIdMatriz(@PathVariable Integer id) {
        return service.findByIdMatriz(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Esanmovmaternidade input) {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody Esanmovmaternidade input) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }

}
