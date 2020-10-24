package com.cybertek.tests.self_practice.AlisWonderland;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleVerification {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com");

    }
    @Test
    public void titleVerification(){
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }
    @Test
    public void searchBox(){
        WebElement searchButton = driver.findElement(By.xpath("//input[@name='q']"));
        searchButton.sendKeys("apple watch"+ Keys.ENTER);

        String expectedR= "apple watch";
        String actualR = driver.getTitle();

        Assert.assertTrue(actualR.contains(expectedR),"Title does not contain search value.");
    }
    @AfterMethod
    public void after() throws InterruptedException{
        Thread.sleep(1000);
        driver.close();
    }
}
