package com.springfirebird.esanlote;

import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class EsanloteService {

    @Autowired
    private EsanloteDao dao;
    @Autowired
    private EntityManager em;

    public List<Esanlote> findAll() {
        return em.createNativeQuery("select * FROM ESANLOTE l "
                + "where l.FLSITUACAO = '4' "
                + "or l.FLSITUACAO = '6' ", Esanlote.class).getResultList();
    }

    List<Esanlote> findLotesCreche() {
        Esanlote l = new Esanlote();
        l.setFlsituacao("4");
        return dao.findAll(Example.of(l));
    }

    Esanlote findByIdCreche(Integer id) {
        Esanlote l = new Esanlote();
        l.setFlsituacao("4");
        l.setCdlote(id);
        return dao.findOne(Example.of(l)).get();
    }

    List<Esanlote> findLotesterminacao() {
        Esanlote l = new Esanlote();
        l.setFlsituacao("6");
        return dao.findAll(Example.of(l));
    }

    Esanlote findById(Integer id) {
        return dao.findById(id).get();
    }

    Esanlote findLoteTerminacaoById(Integer id) {
        Esanlote l = new Esanlote();
        l.setFlsituacao("6");
        l.setCdlote(id);
        return dao.findOne(Example.of(l)).get();

    }

}
