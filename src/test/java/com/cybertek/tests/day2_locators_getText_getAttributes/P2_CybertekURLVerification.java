package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    public static void main(String[] args) {


        //TC #2: Cybertek verifications
        //1. Open Chrome browser
        // I need to set up muy  browser driver
        WebDriverManager.chromedriver().setup();

        // to create instance of chrome browser from WebDriver
        WebDriver driver = new ChromeDriver();

        // this line is will maximize the newly opened browser page

        driver.manage().window().maximize();
        //2. Go to https://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");

        //3. Verify URL contains
        //Expected: cybertekschool
        String expectedResult = "Cybertekschool";
        String actualResult = driver.getCurrentUrl();

        if(actualResult.contains(expectedResult)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!!!!");
        }
        //4. Verify title:
        //Expected: Practice
        // --> actual title <--  --> expected title<---

        if(driver.getTitle().equals("Practice")){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        // Hello






    }
}
