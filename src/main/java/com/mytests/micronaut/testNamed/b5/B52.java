package com.mytests.micronaut.testNamed.b5;


import jakarta.inject.Named;
import jakarta.inject.Singleton;
@Singleton
@Named("b5_jakarta")
public class B52 implements B5Service{
    @Override
    public String getId(){
        return " ***** ";
    }
}
