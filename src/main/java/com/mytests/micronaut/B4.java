package com.mytests.micronaut;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Named("b4")
public class B4 {
    public String getId(){
        return ":)))";
    }
}
