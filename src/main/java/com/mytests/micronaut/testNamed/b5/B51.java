package com.mytests.micronaut.testNamed.b5;


import javax.inject.Named;
import javax.inject.Singleton;
@Singleton
@Named("b5_javax")
public class B51 implements B5Service{
    @Override
    public String getId(){
        return " ***** ";
    }
}
