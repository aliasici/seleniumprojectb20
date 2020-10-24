package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown_Introduction {

    WebDriver driver;
   // public String name;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropdown_test_1() throws InterruptedException{
        //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        //  WE MUST LOCATE THE DROPDOWN THEN PASS IT INTO SELECT CONSTRUCTOR

        // Select select = new Select(driver.findElement(By.LOCATOR));
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        //return type is web element
        // syntax: select.byVisibleText("text goes here");

        String actualSelectedOption = simpleDropdown.getFirstSelectedOption().getText(); // kutudaki text i alir
        String expectedSelectedOption = "Please select an option";

        Assert.assertEquals(actualSelectedOption,expectedSelectedOption);

        Thread.sleep(2000);
        simpleDropdown.selectByVisibleText("Option 1");

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
    }
}
