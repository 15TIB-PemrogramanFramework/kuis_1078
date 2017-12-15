/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1078.service;

import com.tib.kuis_1078.entity.Mobil_1078;
import com.tib.kuis_1078.repo.Mobil_1078_Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC-12-320
 */
@Service("mobil_1078_Service")
@Transactional
public class Mobil_1078_Service {

    @Autowired
    private Mobil_1078_Repo repo;

    public Mobil_1078 insert(Mobil_1078 mobil_1078) {
        return repo.save(mobil_1078);
    }
    
    public Mobil_1078 update(Mobil_1078 mobil_1078) {
        return repo.save(mobil_1078);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Mobil_1078 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Mobil_1078> getAll(){
        return repo.findAllMobil_1078();
    }
}
