package com.mytests.micronaut.testNamed.singleBeans;

import io.micronaut.context.annotation.Value;
import jakarta.inject.Singleton;


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
