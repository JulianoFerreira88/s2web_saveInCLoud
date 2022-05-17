/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.esanlote;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springfirebird.esanlote.Esanlote;

/**
 *
 * @author Juliano
 */
public interface EsanloteRepository extends JpaRepository<Esanlote, Integer> {
    
}
