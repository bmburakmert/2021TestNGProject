package com.cybertek.tests.day7_introTestNG_radioButton_assert;

import org.testng.annotations.*;

public class FirtsTestNGTest {
    @Test
    public void test1(){

        System.out.println("First TestNG test");
    }
    @Ignore
    @Test
    public void test2(){

        System.out.println("Second TestNG test");
    }
    @BeforeMethod
    public void beforeMet(){

        System.out.println("run before each method");
    }

    @AfterMethod
    public void afterMet(){

        System.out.println("run after each method");
    }

    @AfterClass
    public void afterClas(){

        System.out.println("run after this class");
        System.out.println("close the browser");
    }

}
