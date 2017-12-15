/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1078.repo;

import com.tib.kuis_1078.entity.Mobil_1078;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC-12-320
 */
public interface Mobil_1078_Repo extends CrudRepository<Mobil_1078, Long> {

    @Query("select c from Mobil_1078 c")
    public List<Mobil_1078> findAllMobil_1078();
}
