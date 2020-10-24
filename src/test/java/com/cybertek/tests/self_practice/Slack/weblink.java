package com.cybertek.tests.self_practice.Slack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class weblink {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
    }
    @Test
    public void linksFind() throws InterruptedException {
//        WebElement iframeElement=driver.findElement(By.name("iframe_a"));
//        driver.switchTo().frame(iframeElement);
        //      driver.switchTo().frame(1);
        driver.switchTo().frame("iframe_a");
//        Thread.sleep(3000);
//        List<WebElement> listLinks=driver.findElements(By.xpath("//body//a"));
//        System.out.println(listLinks.size());
        WebElement menu=driver.findElement(By.id("dropdownButton"));
        System.out.println(menu.getText());
    }
    @AfterClass
    public void close() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }

}
