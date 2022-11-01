package com.mytests.micronaut.valueStringAsBeanArg;

import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Value;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 11/1/2022.</p>
 * <p>Project: micronaut-jakarta-test0</p>
 * *
 */
@Factory
public class MyBeansFactory {

    @Singleton
   public MyBean2 myBean2(@Value("myBean2") String id){
       return new MyBean2(id);
   }
}
