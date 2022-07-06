/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springfirebird.ecuscastrolandafinanceiro;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juliano
 */
@RestController
@RequestMapping("/url")
public class EcuscastrolandafinanceiroResource {

    @GetMapping()
    public List<Ecuscastrolandafinanceiro> list() {
        return null;
    }

    @GetMapping("/{id}")
    public Ecuscastrolandafinanceiro get(@PathVariable String id) {
        return null;
    }

}
