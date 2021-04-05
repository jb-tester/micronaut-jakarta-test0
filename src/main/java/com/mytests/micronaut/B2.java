package com.mytests.micronaut;

import io.micronaut.context.annotation.Value;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 05.04.2021.</p>
 * <p>Project: micronaut-jakarta-test0</p>
 * *
 */
@Singleton()
public class B2 {
    @Value("${my.props.p1}")
    String bar;

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }
}
