package com.mytests.micronaut.valueStringAsBeanArg;

/**
 * *
 * <p>Created by irina on 11/1/2022.</p>
 * <p>Project: micronaut-jakarta-test0</p>
 * *
 */
public class MyBean2 {
    String id;
    public MyBean2(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
}
