package com.cybertek.tests.self_practice.cybertek_practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        Thread.sleep(2000);

          driver.get("http://practice.cybertekschool.com/checkboxes");
//        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(1)")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(2)")).click();
//        Thread.sleep(2000);

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        //Loop through this list of elements
        for(WebElement checkbox : checkboxes){
            Thread.sleep(2000);
            if(!checkbox.isSelected()){
                checkbox.click();
            }
        }
        driver.quit();

    }


}
