package com.springfirebird.esanmatriz;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class EsanmatrizService {

    @Autowired
    private EsanmatrizRepository dao;
    @Autowired
    private EntityManager em;

    public List<Esanmatriz> findALl() {
        Query query = em.createNativeQuery("SELECT * FROM ESANMATRIZ m WHERE m.flsituacao = 'A' ", Esanmatriz.class);
        return query.getResultList();
    }

    public EsanmatrizRepository getDao() {
        return dao;
    }

    public void setDao(EsanmatrizRepository dao) {
        this.dao = dao;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
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
        Esanmatriz m = new Esanmatriz();
        m.setEstadoreprodutivo("L");
        m.setCdmatriz(Integer.parseInt(id));
        return dao.findOne(Example.of(m)).get();
    }

    public Esanmatriz findLactantesById1(String id1) {
        Esanmatriz m = new Esanmatriz();
        m.setEstadoreprodutivo("L");
        m.setId1(id1.toUpperCase());
        return dao.findOne(Example.of(m)).get();
    }

    public Esanmatriz findById(Integer id) {
        return dao.findById(id).get();
    }

    Esanmatriz findGestantesById(Integer id) {
        Esanmatriz m = new Esanmatriz();
        m.setEstadoreprodutivo("G");
        m.setCdmatriz(id);
        return dao.findOne(Example.of(m)).get();
    }

    Esanmatriz findVaziasById(Integer id) {
        Esanmatriz m = new Esanmatriz();
        m.setEstadoreprodutivo("V");
        m.setCdmatriz(id);
        return dao.findOne(Example.of(m)).get();
    }

}
