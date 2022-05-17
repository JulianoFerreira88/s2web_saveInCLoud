package com.springfirebird.esandesmame;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/desmames")
public class EsandesmameResource {

    @Autowired
    private EsandesmameService service;

    @GetMapping("/{id}")
    public Esandesmame findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/matriz/{id}")
    public List<Esandesmame> findByIdMatriz(@PathVariable Integer id) {
        return service.findByIdMatriz(id);
    }

}
