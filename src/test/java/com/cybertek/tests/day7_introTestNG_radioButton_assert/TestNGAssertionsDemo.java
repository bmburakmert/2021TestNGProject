package com.cybertek.tests.day7_introTestNG_radioButton_assert;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestNGAssertionsDemo {
    @Test
    public void test1(){
        Assert.assertEquals(2,2);
        System.out.println("i verifyed first assert");
        Assert.assertEquals("Button1","Button2");
        System.out.println("hi burak");
    }
    @Test
    public void test2(){
        Assert.assertEquals(2,2);
        Assert.assertEquals("Button1","Button1");
        System.out.println("hi burak");
    }
    @Test
    public void test3(){
        String name = "Burak";
        String surname = "Mert";
        String basHarfi = "B";

        assertTrue(surname.startsWith(basHarfi),"verify surname start with b");
        assertTrue(name.startsWith(basHarfi));
    }
    @Test
    public void test4(){
        String name = "Burak";
        String surname = "Mert";
        String basHarfi = "B";

        assertTrue(surname.startsWith(basHarfi),"verify surname start with b");
        assertTrue(name.startsWith(basHarfi));
    }
}
