package com.cybertek.tests.self_practice.AlisWonderland;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class StateDropdown2 {
    //: Selecting state from State dropdown and verifyingresult
    // 1.Open Chrome browser
    // 2.Go to http://practice.cybertekschool.com/dropdown
    // 3.Select Illinois
    // 4.Select Virginia
    // 5.Select California
    // 6.Verify final selected option is California.'
    // Use all Select options.(visible text, value, index

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Ates ediyor");
    }
    @Test
    public void stateDropdown(){
      Select state = new Select(driver.findElement(By.xpath("//select[@id='state']"))); // ONCE DROPDOWN A GIT

      state.selectByVisibleText("Illinois");


      state.selectByValue("VA");


      state.selectByIndex(5);

        String expectedR = "California";
        String actualR = state.getFirstSelectedOption().getText();

        if(actualR.equals(expectedR)){
            System.out.println("it is  PASSED");
        }else {
            System.out.println("It is FAILED");
        }
        Assert.assertEquals(actualR,expectedR,"Ahand da calisti");

    }
}
