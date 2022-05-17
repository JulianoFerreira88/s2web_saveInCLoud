package com.springfirebird.esanmovanimais;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class EsanmovanimaisService {

    @Autowired
    private EsanmovanimaisDao dao;
    @Autowired
    private EntityManager em;

    Esanmovanimais findById(Integer id) {
        return dao.findById(id).get();
    }

    List<Esanmovanimais> findByLote(Integer idlote) {
        Esanmovanimais mov = new Esanmovanimais();
        mov.setCdlote(idlote);
        mov.setCdfase(4);
        return dao.findAll(Example.of(mov));
    }

    List<Esanmovanimais> findDesmamesByLote(Integer idlote) {
        Esanmovanimais mov = new Esanmovanimais();
        mov.setCdlote(idlote);
        mov.setFltipo("D");
        return dao.findAll(Example.of(mov));
    }

    List<Esanmovanimais> findMortesByLote(Integer idlote) {
        Esanmovanimais mov = new Esanmovanimais();
        mov.setCdlote(idlote);
        mov.setFltipo("O");
        return dao.findAll(Example.of(mov));
    }

    List<Esanmovanimais> findDoacoesByLote(Integer idlote) {
        Esanmovanimais mov = new Esanmovanimais();
        mov.setCdlote(idlote);
        mov.setFltipo("L");
        return dao.findAll(Example.of(mov));
    }

    List<Esanmovanimais> findRecebimentosByLote(Integer idlote) {
        Esanmovanimais mov = new Esanmovanimais();
        mov.setCdsalalote2(idlote);
        mov.setFltipo("L");
        return dao.findAll(Example.of(mov));
    }

    List<Esanmovanimais> findByInterval(Date inicio, Date fim) {
        return null;
    }

    List<Esanmovanimais> findAllVendasNormais(String inicio, String fim) {
        return em.createNativeQuery("SELECT * FROM ESANMOVANIMAIS m "
                + "WHERE m.fltipo = 'V' AND m.fltipovenda = 'L' "
                + "AND m.dtmovimentacao >= '" + inicio + "' "
                + "AND m.dtmovimentacao <= '" + fim + "' ", Esanmovanimais.class).getResultList();
    }

    List<Esanmovanimais> findAllVendasApriveitaveis() {
        Esanmovanimais mov = new Esanmovanimais();
        mov.setFltipo("V");
        mov.setFltipovenda("L");
        return dao.findAll(Example.of(mov));
    }

}
