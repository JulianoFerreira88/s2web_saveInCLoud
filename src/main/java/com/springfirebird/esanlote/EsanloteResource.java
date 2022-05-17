package com.springfirebird.esanlote;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lotes")
public class EsanloteResource {

    @Autowired
    private EsanloteService service;

    @GetMapping()
    public List<Esanlote> findAll() {
        return service.findAll();
    }

    @GetMapping("/creche")
    public List<Esanlote> lotesCreche() {
        return service.findLotesCreche();
    }

    @GetMapping("/creche/{id}")
    public Esanlote findByIdCreche(@PathVariable Integer id) {
        return service.findByIdCreche(id);
    }

    @GetMapping("/terminacao")
    public List<Esanlote> lotesTerminacao() {
        return service.findLotesterminacao();
    }

    @GetMapping("/terminacao/{id}")
    public Esanlote lotesTerminacaoById(@PathVariable Integer id) {
        return service.findLoteTerminacaoById(id);
    }

    @GetMapping("/{id}")
    public Esanlote findById(@PathVariable Integer id) {
        return service.findById(id);
    }

}
