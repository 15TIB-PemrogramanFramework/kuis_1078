/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1078.service;

import com.tib.kuis_1078.entity.Aksesoris_1078;
import com.tib.kuis_1078.repo.Aksesoris_1078_Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC-12-320
 */
@Service("aksesoris_1078_Service")
@Transactional
public class Aksesoris_1078_Service {

    @Autowired
    private Aksesoris_1078_Repo repo;

    public Aksesoris_1078 insertOrUpdate(Aksesoris_1078 aksesoris_1078) {
        return repo.save(aksesoris_1078);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Aksesoris_1078> findAll() {
        return repo.findAllAksesoris_1078();
    }

    public List<Aksesoris_1078> findByMobil_1078(Long mobil_1078Id) {
        return repo.findByMobil_1078(mobil_1078Id);
    }

    public List<Aksesoris_1078> findByName(String name) {
        return repo.findByName("%" + name + "%");
    }
}

