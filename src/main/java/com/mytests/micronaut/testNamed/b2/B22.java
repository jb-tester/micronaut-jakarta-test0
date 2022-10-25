package com.mytests.micronaut.testNamed.b2;

import jakarta.inject.Singleton;

@Singleton
public class B22 implements B2Service {
    @Override
    public String getStr() {
        return "b22";
    }
}
