/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.model.services;

import com.springfirebird.model.entities.Esancobertura;
import com.springfirebird.model.repositories.EsancoberturaRepository;
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
public class EsancoberturaService {

    @Autowired
    private EsancoberturaRepository dao;
    @Autowired
    private EntityManager em;

    public List<Esancobertura> findAllByCodMatriz(Integer cdmatriz) {
        Query query = em.createNativeQuery(""
                + "SELECT * FROM ESANCOBERTURA c "
                + "WHERE c.cdmatriz = '" + cdmatriz + "'", Esancobertura.class);
        return query.getResultList();

    }
}
