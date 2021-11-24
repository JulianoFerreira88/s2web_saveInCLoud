/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.springfirebird.model.entities.Esanmatriz;
import com.springfirebird.model.services.MatrizService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Juliano
 */
@RestController
@RequestMapping("/matrizes")
public class MatrizResource {

    @Autowired
    private MatrizService service;

    @GetMapping()
    public List<Esanmatriz> findAll() {
        return service.findALl();
    }

    @GetMapping("/lactantes")
    public List<Esanmatriz> findLactantes() {
        return service.findLactantes();
    }

    @GetMapping("/gestantes")
    public List<Esanmatriz> findGestantes() {
        return service.findGestantes();
    }

    @GetMapping("/vazias")
    public List<Esanmatriz> findVaizas() {
        return service.findVazias();
    }

    @GetMapping("/vazias/count")
    public Integer findVaizasCount() {
        return service.findVazias().size();
    }

    @GetMapping("/lactantes/count")
    public Integer findLactantesCount() {
        return service.findLactantes().size();
    }

    @GetMapping("/lactantes/{id}")
    public Esanmatriz findLactantesById(@PathVariable String id) {
        return service.findLactantesById(id);
    }

    @GetMapping("/gestantes/count")
    public Integer findGestantesCount() {
        return service.findGestantes().size();
    }

    @GetMapping("/{id}")
    public Esanmatriz get(@PathVariable String id) {
        return service.findById(Integer.parseInt(id));
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Esanmatriz input) {
//        return null;
//    }
//
//    @PostMapping
//    public ResponseEntity<?> post(@RequestBody Esanmatriz input) {
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable String id) {
//        return null;
//    }
}
