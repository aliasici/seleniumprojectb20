package com.cybertek.tests.self_practice.Edureka;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DemaoClass {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com");

        driver.manage().window().maximize();
       // driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("wooden spoon"+ Keys.ENTER);
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("wooden spoon"+ Keys.ENTER);

        driver.navigate().back();
        driver.get("https://www.ebay.com");
        driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
    }
}
