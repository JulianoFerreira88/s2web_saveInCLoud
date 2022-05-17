package com.springfirebird.esancobertura;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    Esancobertura findById(Integer id) {
        return dao.findById(id).get();
    }

}
