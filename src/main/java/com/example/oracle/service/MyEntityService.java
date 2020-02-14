/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.oracle.service;

import com.example.oracle.entitiy.MyEntity;
import com.example.oracle.repository.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gerardo
 */
@Service
public class MyEntityService {
    
    MyEntityRepository repository;
    
    @Autowired
    public MyEntityService(MyEntityRepository myEntityRepository) {
        repository = myEntityRepository;
    }
    
    public void saveMyEntity(MyEntity myEntity){
        repository.save(myEntity);
    }
    
}
