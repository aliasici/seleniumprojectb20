package com.cybertek.tests.self_practice.AlisWonderland;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown1 {


    //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
    // 1.Open Chrome browser
    // 2.Go to http://practice.cybertekschool.com/dropdown
    // 3.Verify “Simple dropdown” default selected value is correctExpected: // please....
    // “Please select an option”
    // 4.Verify“State selection”
    // default selected value is correctExpected: “Select a State”

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @AfterMethod
    public void tearMethod(){
        System.out.println("It is working");
    }

    @Test
    public void simpleDropdown(){
     WebElement simpleDropdown = driver.findElement(By.xpath("//option[.='Please select an option']"));
     String expectedR = "Please select an option";
     String actualR = simpleDropdown.getText(); // Please select an option

     if(actualR.equals(expectedR)){
         System.out.println("Test is PASSED");
     }else {
         System.out.println("Test FAILED");
     }
    }

    @Test
    public void stateDropdown(){
        WebElement stateDropdown = driver.findElement(By.xpath("//option[.='Select a State']"));

        String expectedText = "Select a State";
        String actualText = stateDropdown.getText();

        if(actualText.equals(expectedText)){
            System.out.println("it passed");
        }else{
            System.out.println("It is failed");
        }

    }


}
