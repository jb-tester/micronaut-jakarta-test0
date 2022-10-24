package com.mytests.micronaut.primarySecondary;

import javax.inject.Singleton;

@Singleton
public class PrimImpl implements PrimSecService {
    @Override
    public String getStr() {
        return "prim";
    }
}
