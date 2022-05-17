package com.springfirebird.esanmatrizcompleta;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class EsanmatrizCompletaService {

    @Autowired
    private EsanmatrizCompletaRepository dao;

    public List<EsanmatrizCompleta> findLactantes() {
        EsanmatrizCompleta m = new EsanmatrizCompleta();
        m.setEstadoreprodutivo("L");
        m.setSituacao("A");
        return dao.findAll(Example.of(m));
    }

    List<EsanmatrizCompleta> findGestantes() {
        EsanmatrizCompleta m = new EsanmatrizCompleta();
        m.setEstadoreprodutivo("G");
        m.setSituacao("A");
        return dao.findAll(Example.of(m));
    }

    List<EsanmatrizCompleta> findVazias() {
        EsanmatrizCompleta m = new EsanmatrizCompleta();
        m.setEstadoreprodutivo("V");
        m.setSituacao("A");
        return dao.findAll(Example.of(m));
    }

    EsanmatrizCompleta findById(String id) {
        EsanmatrizCompleta m = new EsanmatrizCompleta();
        m.setCdmatriz(Integer.parseInt(id));
        m.setSituacao("A");
        return dao.findOne(Example.of(m)).get();
    }
}
