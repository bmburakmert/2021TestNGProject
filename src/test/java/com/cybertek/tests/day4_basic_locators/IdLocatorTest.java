package com.cybertek.tests.day4_basic_locators;

import com.cybertek.Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //maximize the browser
        driver.manage().window().maximize();

        //click
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        // click the don't click button
        WebElement dontClickButton = driver.findElement(By.id("disappearing_button"));

        dontClickButton.click();
        //clicking button
        dontClickButton.click();
        //close the browser
        driver.quit();

    }
}
