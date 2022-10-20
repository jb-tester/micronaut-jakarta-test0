package com.mytests.micronaut.testNamed.b7;

import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 10/20/2022.</p>
 * <p>Project: micronaut-jakarta-test0</p>
 * *
 */
@Singleton
//@Named
public class B7ServiceImpl2 implements B7Service {
    @Override
    public String getId() {
        return "b72";
    }
}
