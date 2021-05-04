package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
    // Setting up the browse
        WebDriverManager.chromedriver().setup();

        //import class CMD+Enter
        //Selenium object
        WebDriver driver = new ChromeDriver();

        //navigate to website
        driver.get("http://www.google.com");

        Thread.sleep(5000);
        Thread.sleep(2000);

        //another way of opening website
        driver.navigate().to("https://facebook.com");
        Thread.sleep(5000);

        //goes back to previous webpage
        driver.navigate().back();

        //goes  forward after goes back
        driver.navigate().forward();

        //refresh the page
        driver.navigate().refresh();

    }

}

