package com.cybertek.tests.self_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vytrack {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation1-
        //Open a chrome browser

        WebDriverManager.chromedriver().setup();

        //open browser

        WebDriver driver = new ChromeDriver();

        // 2-Go to: Vytrack web site
        driver.get("https://qa2.vytrack.com/user/login");

     //   driver.findElement(By.name("u")).sendKeys("user153" + Keys.ENTER);
        driver.findElement(By.id("prependedInput")).sendKeys("user153");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123" + Keys.ENTER);


    }
}
