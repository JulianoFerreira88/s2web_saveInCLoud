/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.econdesmamesparicais;

import com.springfirebird.econdesmamesparicais.Econdesmamesparciais;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Juliano
 */
@RestController
@RequestMapping("/desmames_parciais")
public class EcondesmamesparciaisResource {

    @Autowired
    private EntityManager em;

    @GetMapping()
    public List<Econdesmamesparciais> list() {
        Query query = em.createNativeQuery("SELECT * FROM ECONDESMAMESPARCIAIS d", Econdesmamesparciais.class);
        return query.getResultList();
    }

}
