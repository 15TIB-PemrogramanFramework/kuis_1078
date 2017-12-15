/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1078.controller;

import com.tib.kuis_1078.entity.Mobil_1078;
import com.tib.kuis_1078.service.Mobil_1078_Service;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author PC-12-320
 */
public class mobil_1078_Controller {
    private Mobil_1078_Service mobil_1078_Service;

    @RequestMapping(method = RequestMethod.POST)
    public Mobil_1078 insert(@RequestBody Mobil_1078 mobil_1078) {
        return mobil_1078_Service.insert(mobil_1078);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Mobil_1078 update(@RequestBody Mobil_1078 mobil_1078) {
        return mobil_1078_Service.update(mobil_1078);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return mobil_1078_Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Mobil_1078 getById(@PathVariable("id") Long id){
        return mobil_1078_Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Mobil_1078> getAll(){
        return mobil_1078_Service.getAll();
    }
}
