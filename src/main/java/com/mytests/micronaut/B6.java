package com.mytests.micronaut;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Named("b6")
public class B6 implements B6Service {
    public String getId(){
        return "-----";
    }
}
