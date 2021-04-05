package com.mytests.micronaut;

import io.micronaut.context.annotation.Value;

import javax.inject.Singleton;


@Singleton
public class B1 {
    @Value("${micronaut.application.name}")
    String foo;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
