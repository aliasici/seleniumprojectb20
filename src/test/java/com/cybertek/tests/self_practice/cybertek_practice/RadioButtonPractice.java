package com.cybertek.tests.self_practice.cybertek_practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonPractice {
    //http://practice.cybertekschool.com/radio_buttons
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        Thread.sleep(2000);

//        driver.findElement(By.xpath("//label[text()='Yellow']/preceding-sibling::input")).click();
//
//        Thread.sleep(2000);
//
//        System.out.println( driver.findElement(By.xpath("//label[contains(text(),'Green')]/preceding-sibling::input")).isEnabled());
//
//        driver.findElement(By.xpath("//label[contains(text(),'Green')]/preceding-sibling::input")).click();

        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));
        for(WebElement radio : radioButtons){
            System.out.println(radio.getAttribute("name")+"-"+radio.isEnabled());
        }
        Thread.sleep(2000);

        driver.close();
    }
}
