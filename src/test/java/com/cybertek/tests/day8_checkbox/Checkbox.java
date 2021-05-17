package com.cybertek.tests.day8_checkbox;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Checkbox {

WebDriver driver = WebDriverFactory.getDriver("chrome");
    @Test
    public void checkbox(){

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
        WebElement checkBox2 = driver.findElement(By.id("checkBoxOption2"));

        checkBox1.click();

        System.out.println("is checkbox1 selected? Answer: " + checkBox1.isSelected());
        Assert.assertTrue(checkBox1.isSelected());


    }
    @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();

    }
}
