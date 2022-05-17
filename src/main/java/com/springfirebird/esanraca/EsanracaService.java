/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.esanraca;

import com.springfirebird.esanraca.Esanraca;
import com.springfirebird.esanraca.EsanracaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juliano
 */
@Service
public class EsanracaService {

    @Autowired
    private EsanracaRepository dao;

    public List<Esanraca> findAll() {
        return dao.findAll();
    }

    public Esanraca findById(Integer id) {
        return dao.getById(id);
    }
}
