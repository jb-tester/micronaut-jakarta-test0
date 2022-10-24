package com.mytests.micronaut.primarySecondary;


import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class UsePrimSecond {

    @Inject
    PrimSecService service;

    public String primSecDisplay(){
        return "Secondary test: "+service.getStr();
    }
}
