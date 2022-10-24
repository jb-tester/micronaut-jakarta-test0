package com.mytests.micronaut.primarySecondary;

import io.micronaut.context.annotation.Secondary;
import jakarta.inject.Singleton;


@Singleton
@Secondary
public class SecondaryImpl1 implements PrimSecService {
    @Override
    public String getStr() {
        return "secondary1";
    }
}
