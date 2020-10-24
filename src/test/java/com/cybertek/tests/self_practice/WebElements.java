package com.cybertek.tests.self_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wooden spoon");

        driver.findElement(By.className("nav-input")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("OXO")).click();
        driver.navigate().to("https://www.google.com");
        Thread.sleep(4000);

        driver.navigate().back();
    }
}
