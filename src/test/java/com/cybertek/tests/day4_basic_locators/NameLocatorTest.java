package com.cybertek.tests.day4_basic_locators;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {

        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //navigate yo website
        driver.get("http://practice.cybertekschool.com/sign_up");

        //enter full name
        WebElement fullnameInput = driver.findElement(By.name("full_name"));
        fullnameInput.sendKeys("Mike Smith");

        //enter email
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("mikesmit@test.com");

        //click sign up button
        WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();

        // verify that you got "thank you for singing up"

        WebElement messageElement = driver.findElement(By.name("signup_message"));

        String actualMessage = messageElement.getText();

        String expectedMessage = "Thank you for signing up . Click the button below to.. ";
        if (expectedMessage.equals(actualMessage)){
            System.out.println("PASS");

        }else {
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }
        //close to browser
        driver.quit();
    }
}
