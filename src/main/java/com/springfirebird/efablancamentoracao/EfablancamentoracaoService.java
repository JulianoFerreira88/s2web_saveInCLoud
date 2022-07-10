package com.springfirebird.efablancamentoracao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EfablancamentoracaoService {

    @Autowired
    private EfablancamentoracaoRepository dao;

    List<Efablancamentoracao> findAll() {
        return dao.findAll();
    }

    Efablancamentoracao findById(Integer id) {
        return dao.findById(id).get();
    }

}
