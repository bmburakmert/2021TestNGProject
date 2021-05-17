package com.cybertek.tests.day8_checkbox;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown {
    WebDriver driver = WebDriverFactory.getDriver("chrome");

    @Test
    public void listOfElemets() {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement dropdownElement = driver.findElement(By.id("dropdown-class-example"));

        Select dropDown = new Select(dropdownElement);


        List<WebElement> options = dropDown.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }

    @Test
    public void test() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement dropdownElement = driver.findElement(By.id("dropdown-class-example"));

        Select dropDown = new Select(dropdownElement);

        String actualResult = dropDown.getFirstSelectedOption().getText();
        System.out.println(actualResult);
        String expectedResult = "Select";
        Assert.assertEquals(actualResult, expectedResult);

        Thread.sleep(2000);
 // using visible text
        dropDown.selectByVisibleText("Option2");

        actualResult = dropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualResult,"Option2");

        // using index
        Thread.sleep(2000);
        dropDown.selectByIndex(3);

        actualResult = dropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualResult,"Option3");

// using value
        Thread.sleep(2000);
        dropDown.selectByValue("option1");
        actualResult = dropDown.getFirstSelectedOption().getText();
        System.out.println(actualResult);
    }


    @AfterTest
    public void afterTest() {
        driver.close();
        driver.quit();

    }

}
