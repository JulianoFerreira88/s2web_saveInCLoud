/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.esanmovmaternidade;

import com.springfirebird.esanmovmaternidade.Esanmovmaternidade;
import com.springfirebird.esanmovmaternidade.EsanmovmaternidadeRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juliano
 */
@Service
public class EsanmovmaternidadeService {

    @Autowired
    private EsanmovmaternidadeRepository dao;

    @Autowired
    private EntityManager em;

    public List<Esanmovmaternidade> findALl() {
        return dao.findAll();
    }

    public List<Esanmovmaternidade> findByIdMatriz(Integer cdmatriz) {
        Query query = em.createNativeQuery("SELECT * FROM ESANMOVMATERNIDADE m "
                + "WHERE m.", Esanmovmaternidade.class);
        return query.getResultList();
    }
}
