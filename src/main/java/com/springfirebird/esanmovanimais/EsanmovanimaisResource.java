package com.springfirebird.esanmovanimais;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentacoes")
public class EsanmovanimaisResource {

    @Autowired
    private EsanmovanimaisService service;

    @GetMapping("/{id}")
    public Esanmovanimais findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/lote/{idlote}")
    public List<Esanmovanimais> findByIdLote(@PathVariable Integer idlote) {
        return service.findByLote(idlote);
    }

    @GetMapping("/desmames/lote/{idlote}")
    public List<Esanmovanimais> findDesmamesByIdLote(@PathVariable Integer idlote) {
        return service.findDesmamesByLote(idlote);
    }

    @GetMapping("/mortes/lote/{idlote}")
    public List<Esanmovanimais> findMortesByIdLote(@PathVariable Integer idlote) {
        return service.findMortesByLote(idlote);
    }

    @GetMapping("/doacoes/lote/{idlote}")
    public List<Esanmovanimais> findDoacoesByIdLote(@PathVariable Integer idlote) {
        return service.findDoacoesByLote(idlote);
    }

    @GetMapping("/recebimentos/lote/{idlote}")
    public List<Esanmovanimais> findRecebimentosByIdLote(@PathVariable Integer idlote) {
        return service.findRecebimentosByLote(idlote);
    }

    @GetMapping("/data/{inicio}/{fim}")
    public List<Esanmovanimais> findRecebimentosByIdLote(@PathVariable Date inicio, @PathVariable Date fim) {
        return service.findByInterval(inicio, fim);
    }

    @GetMapping("/vendas/normais/{inicio}/{fim}")
    public List<Esanmovanimais> findAllVendasNormais(@PathVariable String inicio, @PathVariable String fim) {
        return service.findAllVendasNormais(inicio, fim);
    }

    @GetMapping("/vendas/aproveitaveis")
    public List<Esanmovanimais> findAllVendasAproveitaveis() {
        return service.findAllVendasApriveitaveis();
    }
}
