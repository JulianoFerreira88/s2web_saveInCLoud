package com.springfirebird.esanparto;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class EsanpartoService {

    @Autowired
    private EsanpartoRepository dao;
    @Autowired
    private EntityManager em;

    public List<Esanparto> findALl() {
        return dao.findAll();
    }

    public List<Esanparto> findByCodMatriz(Integer id) {
        Query query = em.createNativeQuery("SELECT * FROM Esanparto p WHERE p.cdmatriz = " + id + " ", Esanparto.class);
        return query.getResultList();
    }

    List<Esanparto> findPartoByMatriz(Integer id) {
        Esanparto p = new Esanparto();
        p.setCdmatriz(id);
        return dao.findAll(Example.of(p));
    }

    public List<Esanparto> findByPeriodo(String inicio, String fim) {
        return (List<Esanparto>) em.createNativeQuery(""
                + "SELECT * FROM ESANPARTO d "
                + "WHERE d.DTFIMPARTO between '" + inicio + "' AND '" + fim + "'", Esanparto.class).getResultList();
    }

}
