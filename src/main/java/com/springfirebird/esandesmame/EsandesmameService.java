/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.esandesmame;

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
public class EsandesmameService {

    @Autowired
    private EsandesmameRepository dao;
    @Autowired
    private EntityManager em;

    public List<Esandesmame> findALl() {
        return dao.findAll();
    }

    public List<Esandesmame> findByIdMatriz(Integer cdmatriz) {
        Query query = em.createNativeQuery(""
                + "SELECT * FROM ESANDESMAME d "
                + "WHERE d.cdmatriz = '" + cdmatriz + "'", Esandesmame.class);
        return query.getResultList();
    }

    Esandesmame findById(Integer id) {
        return dao.findById(id).get();
    }

    public List<Esandesmame> findByPeriodo(String inicio, String fim) {
        return (List<Esandesmame>) em.createNativeQuery(""
                + "SELECT * FROM ESANDESMAME d "
                + "WHERE d.DTDESMAME between '"+inicio+"' AND '"+fim+"'", Esandesmame.class).getResultList();
    }

}
