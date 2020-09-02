package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_FacebookTitleVerification {
    public static void main(String[] args) {
        // TC: #1 Facebook title verifcation
        // 1. open crome browser

        WebDriverManager.chromedriver().setup();

        // creating an intance of ChromeDriver
        //also opening an empty chrome browser

        WebDriver driver = new ChromeDriver();

        //2. go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3, verify title
        //expected : "Facebook - Log In or Sign Up"

        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Facebook title verification passed!");
        }else{
            System.out.println("Facebook title verification failed");
        }
    }
}
