package com.mytests.micronaut.testNamed.b2;

import jakarta.inject.Singleton;

@Singleton
public class B221 extends B22 {
    @Override
    public String getStr() {
        return super.getStr()+"_b221";
    }
}
