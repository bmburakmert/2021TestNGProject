package com.cybertek.tests.day5_xpath;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));

        search.sendKeys("selenium");

        Thread.sleep(3000);

        WebElement arama = driver.findElement(By.xpath("//*[@value='Go']"));

        arama.click();

        WebElement sonuc = driver.findElement(By.xpath("//span[@dir='auto']"));

        System.out.println(sonuc.getText());

        // driver.quit();
    }

}