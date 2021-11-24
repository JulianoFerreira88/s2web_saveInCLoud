/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.resources;

import com.springfirebird.model.entities.Esandesmame;
import com.springfirebird.model.services.EsandesmameService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/desmames")
public class EsandesmameResource {

    @Autowired
    private EsandesmameService service;

    @GetMapping()
    public List<Esandesmame> list() {
        return service.findALl();
    }

    @GetMapping("/{id}")
    public List<Esandesmame> get(@PathVariable Integer id) {
        return service.findALlByCodMatriz(id);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Esandesmame input) {
//        return null;
//    }
//
//    @PostMapping
//    public ResponseEntity<?> post(@RequestBody Esandesmame input) {
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable String id) {
//        return null;
//    }

}
