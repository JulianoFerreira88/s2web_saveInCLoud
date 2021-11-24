/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.model.services;

import com.springfirebird.model.entities.Esanparto;
import com.springfirebird.model.repositories.PartoRepository;
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
public class PartoService {

    @Autowired
    private PartoRepository dao;
    @Autowired
    private EntityManager em;

    public List<Esanparto> findALl() {
        return dao.findAll();
    }

    public List<Esanparto> findByCodMatriz(Integer id) {
        Query query = em.createNativeQuery("SELECT * FROM Esanparto p WHERE p.cdmatriz = " + id + " ", Esanparto.class);
        return query.getResultList();
    }

}
