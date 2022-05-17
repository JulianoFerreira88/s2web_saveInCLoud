package com.springfirebird.resumoperiodo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resumo_periodo")
public class ResumoPeriodoResource {

    @Autowired
    private ResumoPeriodoService service;

    @GetMapping("/{inicio}/{fim}")
    public ResumoPeriodo getResumo(@PathVariable String inicio, @PathVariable String fim) {
        return service.getResumo(inicio, fim);
    }

}
