package com.cybertek.tests.day8_checkbox;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElemets {
    WebDriver driver = WebDriverFactory.getDriver("chrome");

    @Test
    public void listOfElemets() {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        List<WebElement> buttons = driver.findElements(By.className("btn-primary"));

        Assert.assertEquals(buttons.size(), 5);

        for (WebElement button : buttons) {
            System.out.println(button.getText());
        }
        for (int button = 0; button <buttons.size() ; button++) {
            System.out.println(buttons.get(button).getText());
        }

        String element1 = buttons.get(1).getText();
        System.out.println(element1);
        Assert.assertEquals(element1, "Practice");

    }

    @AfterTest
    public void afterTest() {
        driver.close();
        driver.quit();

    }
}
