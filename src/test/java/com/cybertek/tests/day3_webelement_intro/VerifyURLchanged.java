package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLchanged {
    //**
    // open browser
    //go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
    //enter any email
    //click on Retrieve password
    //verify that url changed to http://practice.cybertekschool.com/email_sent
    // */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/fo.rgot_password");

        //enter any email
        WebElement emailInput = driver.findElement(By.name("email"));
        // sendKeys()- --> keyboard actions to webelement / enters given text
        emailInput.sendKeys("email@gmail.com");

        //locate to password button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        // click button
        retrievePasswordButton.click();

        String expectedUrl = "http://practice.cybertekschool.com/email_sent";

        String actualUrl = driver.getCurrentUrl();

        //verify that url to change http://practice.cybertekschool.com/email_sent
        if (expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("expectedUrl = " + expectedUrl);
        }
        //close the browser
        driver.quit();
    }
}
