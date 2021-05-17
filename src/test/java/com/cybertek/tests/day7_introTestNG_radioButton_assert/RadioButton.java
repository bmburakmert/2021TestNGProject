package com.cybertek.tests.day7_introTestNG_radioButton_assert;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class RadioButton {

    WebDriver driver = WebDriverFactory.getDriver("chrome");

    @Test
    public void radioButton(){



//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        WebElement radioButton1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/fieldset[1]/label[1]/input[1]"));

        radioButton1.click();
        Assert.assertTrue(radioButton1.isSelected());


    }
    @Test
    public void radioButtonEnable(){
        WebElement radioButton1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/fieldset[1]/label[1]/input[1]"));

        Assert.assertTrue(radioButton1.isEnabled());
        }

        @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();

    }

}
