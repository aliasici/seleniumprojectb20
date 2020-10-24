package com.cybertek.tests.self_practice.Edureka;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Gmail {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://accounts.google.com/");
        driver.findElement(By.id("identifierId")).sendKeys("aliasici9");
        Thread.sleep(3000);

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Selenium");
        Thread.sleep(3000);
        driver.findElement(By.name("btnK")).click();

        Thread.sleep(3000);

        driver.get("https://login.yahoo.com/");

        driver.findElement(By.cssSelector("#login-username")).sendKeys("abuziddin");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#login-signin")).click();






    }
}
