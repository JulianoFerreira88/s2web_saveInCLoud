/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.esanfuncionario;

import com.springfirebird.esanfuncionario.Esanfuncionario;
import com.springfirebird.esanfuncionario.EsanfuncionarioRepository;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juliano
 */
@Service
public class EsanfuncionarioService {

    @Autowired
    private EsanfuncionarioRepository dao;
    @Autowired
    private EntityManager em;

    public List<Esanfuncionario> findALL() {
        return dao.findAll();
    }

    public Esanfuncionario findById(Integer id) {
        return dao.findById(id).get();
    }
}
