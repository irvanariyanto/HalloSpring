/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author BAY
 */

public class InjectViaSetter{

    private HalloSpringService halloSpringService;
    
    //setter
//    @Autowired
    public void setHalloSpringService(HalloSpringService halloSpringService){
        this.halloSpringService=halloSpringService;
    }
    
    public void getMessage(){
        halloSpringService.sayHallo();
    }
}
