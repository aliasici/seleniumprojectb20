package com.cybertek.tests.self_practice.AlisWonderland;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OlcayAlert {
    /*
    TC #1: Information alert practice1.Open browser
    2.Go to website: http://practice.cybertekschool.com/javascript_alerts
    3.Click to “Click for JS Alert”button
    4.Click to OK button from the alert
    5.Verify “You successfulyclicked an alert”text is displayed
     */
    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }
    @Test
    public void alertJS(){
       WebElement jsAlertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));

       jsAlertButton.click();

        BrowserUtils.wait(2);

        Alert alert = driver.switchTo().alert();
        alert.accept();

       String actualResult = driver.findElement(By.xpath("//p[@id='result']")).getText();
       String expectedResult = "You successfuly clicked an alert NO";

        Assert.assertEquals(actualResult,expectedResult,"Finally anladik");




    }

}
