/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.resources;

import com.springfirebird.model.entities.MatrizCompleta;
import com.springfirebird.model.services.MatrizCompletaService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Juliano
 */
@RestController
@RequestMapping("/matriz_completa")
public class MatrizCompletaResource {

    @Autowired
    private MatrizCompletaService service;

    @GetMapping()
    public List<MatrizCompleta> list() {
        return service.findALl();
    }

//    @GetMapping("/{id}")
//    public MatrizCompleta get(@PathVariable String id) {
//        return null;
//    }
//    @PutMapping("/{id}")
//    public ResponseEntity<?> put(@PathVariable String id, @RequestBody MatrizCompleta input) {
//        return null;
//    }
//
//    @PostMapping
//    public ResponseEntity<?> post(@RequestBody MatrizCompleta input) {
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable String id) {
//        return null;
//    }
}
