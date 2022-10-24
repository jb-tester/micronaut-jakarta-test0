package com.mytests.micronaut.primarySecondary;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UsePrimSecond {

    @Inject PrimSecService service;

    public String primSecDisplay(){
        return "Secondary test: "+service.getStr();
    }
}
