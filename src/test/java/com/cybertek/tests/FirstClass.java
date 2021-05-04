package com.cybertek.tests;

import com.cybertek.tests.day1_basic_navigation.basic_navigation;
import com.cybertek.tests.day2_webdriver_basics.getUrlAndTitle;
import com.github.javafaker.Faker;

public class FirstClass{
    public static void main(String[] args) {
        System.out.println("Hello World");

        Faker faker = new Faker();

        System.out.println(faker.book().author());

        System.out.println(faker.name().fullName());
        System.out.println(faker.address().country());

    }
}
