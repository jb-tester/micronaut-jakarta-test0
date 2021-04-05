package com.mytests.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import jakarta.inject.Named;


@Controller
public class Cont {
    @Inject B1 b1;
    @Inject B2 b2;
    @Inject @Named("b3_2") B3Service b3;
    @Get("/home")
    public String home() {
        return b1.getFoo() + b2.getBar() + b3.getId();
    }
}
