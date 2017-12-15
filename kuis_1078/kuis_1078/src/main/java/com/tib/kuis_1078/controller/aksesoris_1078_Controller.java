/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1078.controller;

import com.tib.kuis_1078.entity.Aksesoris_1078;
import com.tib.kuis_1078.service.Aksesoris_1078_Service;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author PC-12-320
 */
public class aksesoris_1078_Controller {
    private Aksesoris_1078_Service aksesoris_1078_Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public Aksesoris_1078 insertOrUpdate(@RequestBody Aksesoris_1078 aksesoris_1078){
        return aksesoris_1078_Service.insertOrUpdate(aksesoris_1078);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Aksesoris_1078> findAll(){
        return aksesoris_1078_Service.findAll();
    }
}
