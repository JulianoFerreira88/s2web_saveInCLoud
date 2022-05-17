package com.springfirebird.esanmatriz;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matrizes")
public class EsanmatrizResource {

    @Autowired
    private EsanmatrizService service;

    @GetMapping()
    public List<Esanmatriz> findAll() {
        return service.findALl();
    }

    @GetMapping("/lactantes")
    public List<Esanmatriz> findLactantes() {
        return service.findLactantes();
    }

    @GetMapping("/lactantes/{id}")
    public Esanmatriz findLactantesById(@PathVariable String id) {
        return service.findLactantesById(id);
    }

    @GetMapping("/lactantes/brinco/{id}")
    public Esanmatriz findLactantesById1(@PathVariable String id) {
        return service.findLactantesById1(id);
    }

    @GetMapping("/gestantes")
    public List<Esanmatriz> findGestantes() {
        return service.findGestantes();
    }

    @GetMapping("/gestantes/{id}")
    public Esanmatriz findGestantes(@PathVariable Integer id) {
        return service.findGestantesById(id);
    }

    @GetMapping("/vazias")
    public List<Esanmatriz> findVaizas() {
        return service.findVazias();
    }

    @GetMapping("/vazias/{id}")
    public Esanmatriz findVaizasById(@PathVariable Integer id) {
        return service.findVaziasById(id);
    }

    @GetMapping("/vazias/count")
    public Integer findVaizasCount() {
        return service.findVazias().size();
    }

    @GetMapping("/lactantes/count")
    public Integer findLactantesCount() {
        return service.findLactantes().size();
    }

    @GetMapping("/gestantes/count")
    public Integer findGestantesCount() {
        return service.findGestantes().size();
    }

    @GetMapping("/{id}")
    public Esanmatriz get(@PathVariable String id) {
        return service.findById(Integer.parseInt(id));
    }

}
