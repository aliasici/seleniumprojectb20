package com.cybertek.tests.self_practice.google;

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

public class GoogleSearch {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://www.google.com");
    }

      @Test
    public void search() throws InterruptedException{
        WebElement searchButton = driver.findElement(By.xpath("//input[@name='q']"));
      //  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
        searchButton.sendKeys("selenium"+ Keys.ENTER);
        Thread.sleep(2000);
        String expectedR= "selenium";
        String actualR = driver.getTitle();

        Assert.assertTrue(actualR.contains(expectedR),"Title does not contain search value.");
    }
    @AfterMethod
    public void after() throws InterruptedException{
        Thread.sleep(1000);
        driver.close();
    }

}
