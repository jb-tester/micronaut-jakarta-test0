package com.mytests.micronaut;

import com.mytests.micronaut.primarySecondary.UsePrimSecond;
import com.mytests.micronaut.testNamed.UseNamed;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;


@Controller
public class TestController {
   @Inject
   UseNamed useNamed;
   @Inject
    UsePrimSecond usePrimSecond;

    @Get("/named")
    public String namedTest() {
        return useNamed.namedTestDisplay();
    }
    @Get("/primsec")
    public String primSecTest() {
        return usePrimSecond.primSecDisplay();
    }
}
