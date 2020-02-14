/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.oracle.repository;

import com.example.oracle.entitiy.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Gerardo
 */
public interface MyEntityRepository extends JpaRepository<MyEntity, Integer> {
    
}
