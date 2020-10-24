package com.cybertek.tests.self_practice.Edureka;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TwitterSignUp {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://twitter.com");
        driver.findElement(By.linkText("Sign up")).click();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("abuziddin");
        driver.findElement(By.linkText("Phone")).sendKeys("987654321");
       // 'driver.findElement(By.xpath("//"))
    }
}
