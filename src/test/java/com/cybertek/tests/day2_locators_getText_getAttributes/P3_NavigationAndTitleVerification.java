package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {

        //TC #3: Back and forth navigation1-
        //Open a chrome browser
        WebDriverManager.chromedriver().setup();
        //open browser

        WebDriver driver = new ChromeDriver();

        // 2-Go to: https://google.com
        driver.get("https://www.google.com");

        // 3-Click to Gmail from top right
        // we are locating the Gmail web element using findElement method and linkText LOCATOR
        driver.findElement(By.linkText("Gmail")).click();

        // 4-Verify title contains:
        // Expected: Gmail
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Gmail Title verification PASSED!");
        }else{
            System.out.println("Gmail Title verification FAILED!!!");
        }
        // 5-Go back to Google by using the .back();
        driver.navigate().back();
        // 6-Verify title equals:
        // Expected: Google


        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();
        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google title verification PASSED!");
        }else{
            System.out.println("Google title verifcation FAILED!!!");
        }




    }
}
