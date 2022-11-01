package com.mytests.micronaut.valueStringAsBeanArg;

import io.micronaut.context.annotation.Value;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 11/1/2022.</p>
 * <p>Project: micronaut-jakarta-test0</p>
 * *
 */
@Singleton
public class MyBean1 {

    String id;

    public MyBean1(@Value("myBean1") String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
