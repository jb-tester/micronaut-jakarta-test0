package com.mytests.micronaut.testNamed.b3;

import jakarta.inject.Named;

/**
 * *
 * <p>Created by irina on 05.04.2021.</p>
 * <p>Project: micronaut-jakarta-test0</p>
 * *
 */
//@Singleton
@Named("b3_2")
public class B32 implements B3Service{

    @Override
    public String getId() {
        return "!!!";
    }
}
