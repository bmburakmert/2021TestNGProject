package com.cybertek.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_navigation {
    public static void main(String[] args) {

        // we have to setup webdriver based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();

        // creating object for using selenium driver
        WebDriver driver= new ChromeDriver();

        //open browser
        driver.get("http://amazon.com");

        //driver.navigate().to("http://amazon.com");

        System.out.println(driver.getTitle());
    }
}
