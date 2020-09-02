package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_LoginTitleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        //create instance of chrome driver

        WebDriver driver = new ChromeDriver();

        // Go to https://www.facebook.com

        driver.get("https://www.facebook.com");

        // we are going to have to locate
        // some web elements to be able to send data to them
        // 3.Enter incorrect username

        driver.findElement(By.id("email")).sendKeys("anything@gmail.com");

        // 4.Enter incorrect password
        driver.findElement(By.id("pass")).sendKeys("anything" + Keys.ENTER);
        // 5.Verify title changed to: Expected: “Log into Facebook | Facebook

        String expectedTitle = "Log into Facebook | Facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed");
        }
    }
}
