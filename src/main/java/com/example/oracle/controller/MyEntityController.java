/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.oracle.controller;

import com.example.oracle.entitiy.MyEntity;
import com.example.oracle.service.MyEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Gerardo
 */
@Controller
public class MyEntityController {

    MyEntityService service;
    
    @Autowired
    public MyEntityController(MyEntityService myEntityService) {
        service = myEntityService;
    }
    
    @PostMapping("/create")
    public @ResponseBody MyEntity create() {
        MyEntity myEntity = new MyEntity();
        service.saveMyEntity(myEntity);
        return myEntity; 
    }

}
