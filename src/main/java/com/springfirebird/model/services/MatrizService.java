/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.model.services;

import com.springfirebird.model.entities.Esanmatriz;
import com.springfirebird.model.repositories.MatrizRepsoitory;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juliano
 */
@Service
public class MatrizService {

    @Autowired
    private MatrizRepsoitory dao;
    @Autowired
    private EntityManager em;

    public List<Esanmatriz> findALl() {
        Query query = em.createNativeQuery("SELECT * FROM ESANMATRIZ m WHERE m.flsituacao = 'A' ", Esanmatriz.class);
        return query.getResultList();
    }

    public List<Esanmatriz> findLactantes() {
        return this.findByEstadoreprodutivo("L");
    }

    public List<Esanmatriz> findGestantes() {

        return this.findByEstadoreprodutivo("G");
    }

    public List<Esanmatriz> findVazias() {

        return this.findByEstadoreprodutivo("V");
    }

    private List<Esanmatriz> findByEstadoreprodutivo(String estado) {
        Query query = em.createNativeQuery("SELECT * FROM ESANMATRIZ m "
                + "WHERE m.flsituacao = 'A' "
                + "AND m.flestadoreprodutivo = '" + estado + "' ", Esanmatriz.class);
        return query.getResultList();
    }

    public Esanmatriz findLactantesById(String id) {
        Optional<Esanmatriz> matriz = dao.findById(Integer.parseInt(id));
        return matriz.get();
    }

    public Esanmatriz findById(Integer id) {
        return dao.findById(id).get();
    }

}
