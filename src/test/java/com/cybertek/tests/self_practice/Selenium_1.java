package com.cybertek.tests.self_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        WebElement createAccount = driver.findElement(By.id("u_0_2"));
        Thread.sleep(3000);
        createAccount.click();

        WebElement months = driver.findElement(By.id("month"));

        Select month1 = new Select(months);
        Thread.sleep(3000);

        month1.selectByValue("8");


        WebElement day1 = driver.findElement(By.id("day"));

        Select oSelect = new Select(day1);

        Thread.sleep(3000);

        oSelect.selectByValue("12");



        WebElement years = driver.findElement(By.id("year"));
        Select year1 = new Select(years);

        Thread.sleep(3000);

        year1.selectByValue("2013");


    }
}
