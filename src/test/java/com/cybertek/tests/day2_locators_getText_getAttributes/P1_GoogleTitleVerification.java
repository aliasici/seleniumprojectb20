package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class P1_GoogleTitleVerification {
    public static void main(String[] args) {

        //TC #1: Google title verification
        // 1. open chrome browser
        // set up the browser driver
        WebDriverManager.chromedriver().setup();

        //if you are using browser drivers locally, you need to use System.setProperty everytime
        //we use WebDriverManager

        //open a chrome browser
        //we create an instance of the ChromeDriver, which also opens an empty browser for us

        WebDriver driver = new ChromeDriver();

        // 2. go to https://www.google.com

        driver.get("https://www.google.com");

        // 3 verify title
        //expected : Google

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }


    }


}
