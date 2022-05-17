package com.springfirebird.esanmatrizcompleta;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matriz_completa")
public class EsanmatrizCompletaResource {

    @Autowired
    private EsanmatrizCompletaService service;

    @GetMapping("/lactantes")
    public List<EsanmatrizCompleta> findLactantes() {
        return service.findLactantes();
    }

    @GetMapping("/gestantes")
    public List<EsanmatrizCompleta> findGestantes() {
        return service.findGestantes();
    }

    @GetMapping("/vazias")
    public List<EsanmatrizCompleta> findVazias() {
        return service.findVazias();
    }

    @GetMapping("/{id}")
    public EsanmatrizCompleta findById(@PathVariable String id) {
        return service.findById(id);
    }

}
