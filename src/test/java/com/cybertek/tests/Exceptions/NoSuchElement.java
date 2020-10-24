package com.cybertek.tests.Exceptions;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NoSuchElement {
    WebDriver driver;

    @Test
    public void noSuchElement() throws InterruptedException{


        Driver.getDriver().get("https://www.google.com");

        Thread.sleep(2000);


        try{
            driver.findElement(By.name("fake")).click();

        }catch (Exception e){
            System.out.println("element is not found");
            System.out.println("hi");
        }
        System.out.println("Hello");
    }



}
