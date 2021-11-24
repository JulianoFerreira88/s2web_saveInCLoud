/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.springfirebird.model.entities.Esanparto;
import com.springfirebird.model.services.PartoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Juliano
 */
@RestController
@RequestMapping("/partos")
public class PartoResource {

    @Autowired
    private PartoService service;

    @GetMapping()
    public List<Esanparto> findAll() {
        return service.findALl();
    }

    @GetMapping("/{id}")
    public List<Esanparto> findLactantesById(@PathVariable Integer id) {
        return service.findByCodMatriz(id);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Esanparto input) {
//        return null;
//    }
//
//    @PostMapping
//    public ResponseEntity<?> post(@RequestBody Esanparto input) {
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable String id) {
//        return null;
//    }

}
