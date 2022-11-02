package com.mytests.micronaut.testNamed.b8;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 10/20/2022.</p>
 * <p>Project: micronaut-jakarta-test0</p>
 * *
 */
@Singleton
@Named
public class Bean8ServiceFoo implements Bean8Service {
    @Override
    public String getId(){
        return "bean8_foo";
    }
}
