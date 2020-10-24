package com.cybertek.tests.self_practice.Edureka;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumEasyTask {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement successCheck = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));

        WebElement successMessage = driver.findElement(By.xpath("//div[@id='txtAge']"));

        if(!successMessage.isDisplayed()){
            System.out.println("Success Message is not displayed Verification PASSED!");
        }else {
            System.out.println("Success message is displayed Verification FAILED!!!");
        }
        successCheck.click();
        Thread.sleep(3000);
        if(successMessage.isDisplayed()){
            System.out.println("Success Message is displayed Verification PASSED!");
        }else {
            System.out.println("Success message is not displayed Verification FAILED!!!");
        }


    }
}
