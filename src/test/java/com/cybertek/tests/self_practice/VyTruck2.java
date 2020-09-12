package com.cybertek.tests.self_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTruck2 {

        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://qa2.vytrack.com/user/login");
            driver.findElement(By.id("prependedInput")).sendKeys("user172");
            driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
            driver.findElement(By.id("_submit")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span")).click();
            driver.findElement(By.linkText("Vehicles")).click();
//            Thread.sleep(4000);
//            driver.findElement(By.xpath("//tr[@class='grid-row row-click-action'][1]")).click();
//            Thread.sleep(4000);
//            String actualResult = driver.findElement(By.xpath("//h1[@class='user-name']")).getText();
//            String expectedResult = "Texas1092 Magdalena Belgium 2019 red sedan";
//            if(actualResult.equals(expectedResult)){
//                System.out.println("Passed");
//            }else{
//                System.out.println("Failed");
//            }
        }
    }

