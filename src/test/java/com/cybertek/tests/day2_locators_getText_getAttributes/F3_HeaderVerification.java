package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {
    public static void main(String[] args) {
        //Facebook header verification
        //open chrome browser
        //got to https://www.facebook.com


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        //verify header text is as expected
        //expected: "Connect with friends and the world around you on Facebook

        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = driver.findElement(By.className("_8eso")).getText();

//        System.out.println(driver.findElement(By.className("_8eso")));
//        System.out.println(driver.findElement(By.className("_8eso")).getText());

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header verification passed!");
        }else{
            System.out.println("Header verification is failed");
        }


    }

}
