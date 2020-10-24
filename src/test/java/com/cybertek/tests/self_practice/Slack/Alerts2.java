package com.cybertek.tests.self_practice.Slack;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alerts2 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }
    @Test
    public void findAlert() throws InterruptedException {

        WebElement alertFind = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        alertFind.click();
        Thread.sleep(200);

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("hi");
        BrowserUtils.wait(2);
        alert.accept();

    }
}