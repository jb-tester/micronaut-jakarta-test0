package com.mytests.micronaut.testNamed;

import com.mytests.micronaut.testNamed.b2.B22;
import com.mytests.micronaut.testNamed.b2.B221;
import com.mytests.micronaut.testNamed.b2.B2Service;
import com.mytests.micronaut.testNamed.b3.B3Service;
import com.mytests.micronaut.testNamed.b5.B5Service;
import com.mytests.micronaut.testNamed.b6.B6;
import com.mytests.micronaut.testNamed.b6.B6Service;
import com.mytests.micronaut.testNamed.b7.B7Service;
import com.mytests.micronaut.testNamed.b8.Bean8Service;
import com.mytests.micronaut.testNamed.singleBeans.*;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;


@Singleton
public class UseNamed {

    @Inject
    B0 b0;
    @Inject
    B1 b1;

    // target bean has no @Named annotation
    @Inject @Named("b21")
    B2Service b21;

    // Specific bean type injection in case of subtype beans presence:
    // false ambiguous dependency error: should navigate to single bean oof Parent type
    @Inject
    B22 b22;

    @Inject
    B221 b22_1;

    // Specific bean type injection in case of subtype beans presence:
    // false ambiguous dependency error: should navigate to single bean oof Parent type
    @Inject
    Parent parent_bean;

    @Inject
    Child child_bean;


    // (target class has only @Named annotation))
    // no navigation, no completion for one of qualifiers:
    @Inject @Named("b3_2")
    B3Service b3;

    // (target class has only @Named annotation))
    // no navigation, no completion for qualifier
    @Inject @Named("b4")
    B4 b4;

    // incorrect qualifiers are completed, navigation doesn't work - fixed
    @Inject @Named("b5_jakarta")
    B5Service b5;

    // empty name is suggested here - fixed
    @Inject @Named("b6")
    B6 b61;

    // completion is ok here, but navigation doesn't work - fixed
    @Inject @Named("b6")
    B6Service b62;

    // target class has value-less @Named annotation - ok!
    @Inject @Named("b7ServiceImpl1")
    B7Service b7Service1;

    // target class has no @Named annotation: no navigation - fixed
    @Inject @Named("b7ServiceImpl2")
    B7Service b7Service2;

    // target class has @Named annotation with explicit value similar to default (class name): no navigation - fixed
    @Inject @Named("b7ServiceImpl3")
    B7Service b7Service3;

    // target class has @Named annotation with explicit value different from class name: no navigation - fixed
    @Inject @Named("b7_impl4")
    B7Service b7Service4;


    //@Inject @Named("") // test completion; actually 'impl1', 'impl2' and 'foo' are suggested - fixed
    Bean8Service bean8Service;

    public String namedTestDisplay() {
        return "Named test:"+b5.getId()+ " " +b1.getFoo()+ " " + b0.getBar()+ " " +b3.getId()+ " " +b4.getId()+ " " +b61.getId()+ " " +b62.getId()
                + " " +b7Service1.getId()+ " " +b7Service2.getId()+ " " +b7Service3.getId()+ " " +b7Service4.getId()+" "+b21.getStr()+" "+ b22.getStr();
    }

}
