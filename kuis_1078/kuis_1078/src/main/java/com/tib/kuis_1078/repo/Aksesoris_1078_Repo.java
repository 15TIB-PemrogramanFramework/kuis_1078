/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1078.repo;

import com.tib.kuis_1078.entity.Aksesoris_1078;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author PC-12-320
 */
public interface Aksesoris_1078_Repo extends CrudRepository<Aksesoris_1078, Long>{
    
    @Query("select p from Aksesoris_1078 p")
    public List<Aksesoris_1078> findAllAksesoris_1078();
    
    @Query("select p from Aksesoris_1078 p where p.mobil_1078.id= :id")
    public List<Aksesoris_1078> findByMobil_1078(@Param("id") Long id);
    
    @Query("select p from Aksesoris_1078 p where LOWER(p.name) LIKE LOWER(:name)")
    public List<Aksesoris_1078> findByName(@Param("name") String name);
}
