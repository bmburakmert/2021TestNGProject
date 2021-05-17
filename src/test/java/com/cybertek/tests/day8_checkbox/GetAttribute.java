package com.cybertek.tests.day8_checkbox;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GetAttribute {
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    @Test
    public void getAttribute(){

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
        WebElement checkBox2 = driver.findElement(By.id("checkBoxOption2"));

        String checknoxAttrName = checkBox1.getAttribute("name");

        System.out.println(checknoxAttrName);
        System.out.println(checkBox1.getAttribute("type"));
    }
    @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();

    }

}
