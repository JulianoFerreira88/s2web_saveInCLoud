/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.model.repositories;

import com.springfirebird.model.entities.Esanparto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Juliano
 */
public interface PartoRepository extends JpaRepository<Esanparto, Integer> {

}
