/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.resources;

import com.springfirebird.model.entities.Esanfuncionario;
import com.springfirebird.model.services.EsanfuncionarioService;
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
@RequestMapping("/funcionarios")
public class EsanfuncionarioResource {

    @Autowired
    private EsanfuncionarioService service;

    @GetMapping()
    public List<Esanfuncionario> list() {
        return service.findALL();
    }

    @GetMapping("/{id}")
    public Esanfuncionario get(@PathVariable Integer id) {
        return service.findById(id);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Esanfuncionario input) {
//        return null;
//    }
//
//    @PostMapping
//    public ResponseEntity<?> post(@RequestBody Esanfuncionario input) {
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable String id) {
//        return null;
//    }
}
