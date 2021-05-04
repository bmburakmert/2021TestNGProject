package com.cybertek.tests.day4_basic_locators;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TagnameTest {
    public static void main(String[] args) {

        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,50);
        //navigate yo website
        driver.get("https://www.amazon.de/");
        driver.findElement(By.className("")).sendKeys("ser");

driver.quit();

    }
}
