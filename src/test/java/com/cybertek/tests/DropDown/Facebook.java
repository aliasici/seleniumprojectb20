package com.cybertek.tests.DropDown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Facebook {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");

    }

    @Test
    public void facebookdropdown() throws InterruptedException{

        driver.findElement(By.xpath("//a[.='Create New Account']")).click();

        WebElement nameclick = driver.findElement(By.xpath("//input[@name='firstname']"));
        nameclick.sendKeys("abuziddin");

        //Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        WebElement month  = driver.findElement(By.id("month"));
        WebElement day  =driver.findElement(By.id("day"));
        WebElement year  = driver.findElement(By.id("year"));

        month.sendKeys("Jul");
        Thread.sleep(2000);
        day.sendKeys("23");
        Thread.sleep(2000);
        year.sendKeys("1999");


    }
        /*
    @Test
    public void facebook() throws InterruptedException{

        Driver.getDriver().get("https://www.facebook.com");
        Driver.getDriver().manage().window().maximize();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//a[.='Create New Account']")).click();

      WebElement nameclick = Driver.getDriver().findElement(By.xpath("//input[.='firstname']"));
      nameclick.sendKeys("abuziddin");

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        WebElement month  =Driver.getDriver().findElement(By.id("month"));
        WebElement day  =Driver.getDriver().findElement(By.id("day"));
        WebElement year  =Driver.getDriver().findElement(By.id("year"));

        month.sendKeys("5");



//        Select selectMonth = new Select(Driver.getDriver().findElement(By.xpath("//select[@class='_9407 _5dba _8esg']")));
//        Select selectDay = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='day']")));
//        Select selectYear = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='year']")));
//
//        selectMonth.selectByValue("5"); // March
//        Thread.sleep(2000);

//        selectDay.selectByValue("24");
//        Thread.sleep(2000);
//
//
//        selectYear.selectByValue("1994");
//        Thread.sleep(2000);
//

    }

         */
}
