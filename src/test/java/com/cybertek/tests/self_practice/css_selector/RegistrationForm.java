package com.cybertek.tests.self_practice.css_selector;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/registration_form");

        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("James");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Bond");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("email@cybertekschool.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("qwerty123456");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("supersdet");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("303-007-0007");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("10/10/1990");
        Thread.sleep(1000);
        Select select = new Select( driver.findElement(By.cssSelector("select[name='job_title']")));

        driver.findElement(By.cssSelector("input[value='male']")).click();
        select.selectByVisibleText("SDET");
        driver.findElement(By.id("wooden_spoon")).click();

        Thread.sleep(3000);
        driver.quit();

    }
}
