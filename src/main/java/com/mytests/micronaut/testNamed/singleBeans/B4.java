package com.mytests.micronaut.testNamed.singleBeans;

import jakarta.inject.Named;

@Named("b4")
public class B4 {
    public String getId(){
        return "b4";
    }
}
