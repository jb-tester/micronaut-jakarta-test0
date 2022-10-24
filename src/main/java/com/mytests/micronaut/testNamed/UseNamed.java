package com.mytests.micronaut.testNamed;

import com.mytests.micronaut.testNamed.b3.B3Service;
import com.mytests.micronaut.testNamed.b5.B5Service;
import com.mytests.micronaut.testNamed.b6.B6;
import com.mytests.micronaut.testNamed.b6.B6Service;
import com.mytests.micronaut.testNamed.b7.B7Service;
import com.mytests.micronaut.testNamed.b8.Bean8Service;
import com.mytests.micronaut.testNamed.singleBeans.B1;
import com.mytests.micronaut.testNamed.singleBeans.B2;
import com.mytests.micronaut.testNamed.singleBeans.B4;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import javax.inject.Singleton;

@Singleton
public class UseNamed {

    @Inject
    B1 b1;
    @Inject
    B2 b2;

    // incorrect completion for names, no completion for one of qualifiers:
    @Inject @Named("b3_2")
    B3Service b3;

    // no navigation, no completion for qualifier (target class has only @Named annotation)
    @Inject @Named("b4")
    B4 b4;

    // incorrect qualifiers are completed, navigation doesn't work:
    @Inject @Named("b5_jakarta")
    B5Service b5;

    // empty name is suggested here:
    @Inject @Named("b6")
    B6 b61;

    // completion is ok here, but navigation doesn't work:
    @Inject @Named("b6")
    B6Service b62;

    // target class has value-less @Named annotation - ok!
    @Inject @Named("b7ServiceImpl1")
    B7Service b7Service1;

    // target class has no @Named annotation - no navigation
    @Inject @Named("b7ServiceImpl2")
    B7Service b7Service2;

    // target class has @Named annotation with explicit value similar to default (class name) - no navigation
    @Inject @Named("b7ServiceImpl3")
    B7Service b7Service3;

    // target class has @Named annotation with explicit value different from class name - no navigation
    @Inject @Named("b7_impl4")
    B7Service b7Service4;


    //@Inject @Named("") // test completion; actually 'impl1', 'impl2' and 'foo' are suggested
    Bean8Service bean8Service;

    public String namedTestDisplay() {
        return "Named test:"+b5.getId()+ " " +b1.getFoo()+ " " +b2.getBar()+ " " +b3.getId()+ " " +b4.getId()+ " " +b61.getId()+ " " +b62.getId()
                + " " +b7Service1.getId()+ " " +b7Service2.getId()+ " " +b7Service3.getId()+ " " +b7Service4.getId();
    }

}
