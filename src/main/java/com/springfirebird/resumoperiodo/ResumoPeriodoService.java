package com.springfirebird.resumoperiodo;

import com.springfirebird.esandesmame.EsandesmameService;
import com.springfirebird.esanparto.EsanpartoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumoPeriodoService {

    @Autowired
    private EsandesmameService desmameService;
    @Autowired
    private EsanpartoService partoService;

    public ResumoPeriodo getResumo(String inicio, String fim) {
        ResumoPeriodo resumo = new ResumoPeriodo();
        resumo.setInicio(inicio);
        resumo.setFim(fim);
        resumo.setDesmames(desmameService.findByPeriodo(inicio, fim));
        resumo.setPartos(partoService.findByPeriodo(inicio, fim));
        return resumo;
    }
}
