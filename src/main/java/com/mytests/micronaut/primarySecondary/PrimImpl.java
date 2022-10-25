package com.mytests.micronaut.primarySecondary;


import jakarta.inject.Singleton;

@Singleton
public class PrimImpl implements PrimSecService {
    @Override
    public String getStr() {
        return "primary";
    }
}
