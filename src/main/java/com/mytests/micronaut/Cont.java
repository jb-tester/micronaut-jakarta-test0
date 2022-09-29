package com.mytests.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import jakarta.inject.Named;


@Controller
public class Cont {
    @Inject B1 b1;
    @Inject B2 b2;
    
    // incorrect completion for names, no completion for one of qualifiers:
    @Inject @Named("b3_2") B3Service b3;  
    
    // no navigation, no completion for qualifier:
    @Inject @Named("b4") B4 b4;  

    // incorrect qualifiers are completed, navigation doesn't work:
    @Inject @Named("b5_jakarta")
    B5Service b5;

    // empty name is suggested here:
    @Inject @Named("b6")  
    B6 b6;
    
    @Get("/home")
    public String home() {
        return b5.getId() + b1.getFoo() + b2.getBar() + b3.getId() + b4.getId() + b6.getId();
    }
}
