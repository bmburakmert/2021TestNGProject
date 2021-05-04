package com.cybertek.tests.day4_basic_locators;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {
    public static void main(String[] args) {

        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //navigate yo website
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // proper way
        WebElement messageElement = driver.findElement(By.className("h3"));
        String message = messageElement.getText();
        System.out.println(message);

        //Lazy way
        System.out.println(driver.findElement(By.className("h3")));

        //note: if there is a space in the class attribute value, we Cannot use it.

    }
}
