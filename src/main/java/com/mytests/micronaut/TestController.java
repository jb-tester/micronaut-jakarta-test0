package com.mytests.micronaut;

import com.mytests.micronaut.primarySecondary.UsePrimSecond;
import com.mytests.micronaut.testNamed.UseNamed;
import com.mytests.micronaut.valueStringAsBeanArg.MyBean1;
import com.mytests.micronaut.valueStringAsBeanArg.MyBean2;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;


@Controller
public class TestController {
    @Inject
    UseNamed useNamed;
    @Inject
    UsePrimSecond usePrimSecond;
    @Inject
    private MyBean1 myBean1;
    @Inject
    private MyBean2 myBean2;

    @Get("/named")
    public String namedTest() {
        return useNamed.namedTestDisplay();
    }

    @Get("/primsec")
    public String primSecTest() {
        return usePrimSecond.primSecDisplay();
    }

    @Get("/valuedStringsAsArgs")
    public String valuedStringsAsArgs() {
        return myBean1.getId() + " " + myBean2.getId();
    }
}
