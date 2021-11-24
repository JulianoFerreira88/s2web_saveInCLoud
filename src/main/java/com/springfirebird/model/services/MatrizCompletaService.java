/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.model.services;

import com.springfirebird.model.entities.MatrizCompleta;
import com.springfirebird.model.repositories.MatrizCompletaRepository;
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
public class MatrizCompletaService {

    @Autowired
    private MatrizCompletaRepository dao;

    @Autowired
    private EntityManager em;

    public List<MatrizCompleta> findALl() {
        Query query = em.createNativeQuery(""
                + "SELECT * FROM ESANMATRIZ m "
                + "WHERE m.flsituacao = 'A' "
                + "AND m.flestadoreprodutivo = 'L' ", MatrizCompleta.class);
        return query.getResultList();
    }
}
