package com.cybertek.tests.day5_xpath;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpathTest {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement homelink = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));

        homelink.click();


    }

}
