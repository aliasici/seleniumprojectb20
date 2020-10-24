package com.cybertek.tests.self_practice.Edureka;

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

public class Alerts {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }
    @Test
    public void alert_practice() throws InterruptedException{
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));

        warningAlertButton.click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        Thread.sleep(3000);

        BrowserUtils.wait(2);

        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(),"Result text is not displayed. Verification failed!!!");

    }


}
