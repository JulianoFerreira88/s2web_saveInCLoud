/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.esanparto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juliano
 */
@RestController
@RequestMapping("/partos")
public class EsanpartoResource {

    @Autowired
    private EsanpartoService service;

    @GetMapping()
    public List<Esanparto> findAll() {
        return service.findALl();
    }

    @GetMapping("/{id}")
    public List<Esanparto> findLactantesById(@PathVariable Integer id) {
        return service.findByCodMatriz(id);
    }

    @GetMapping("/matriz/{id}")
    public List<Esanparto> findPartoByMatriz(@PathVariable Integer id) {
        return service.findPartoByMatriz(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Esanparto input) {
        return null;
    }

}
