package com.cybertek.tests.self_practice.AlisWonderland;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class StateDropdown {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void selectState()throws InterruptedException{
        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        selectState.selectByVisibleText("Illinois");
        Thread.sleep(1000);

        selectState.selectByValue("VA");
        Thread.sleep(1000);

        selectState.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedResult = "California";
        String actualResult = selectState.getFirstSelectedOption().getText();

        Assert.assertEquals(actualResult, expectedResult, "Actual vs expected is not equal!");
        //Use all Select options. (visible text, value, index)
    }
    @Test
    public void test2_verify_date_dropdown_verification () throws InterruptedException{
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        yearDropdown.selectByVisibleText("1934");
        Thread.sleep(2000);
        monthDropdown.selectByValue("9");
        Thread.sleep(2000);
        dayDropdown.selectByIndex(23);

        String expectedYear = "1934";
        String expectedMonth = "October";
        String expectedDay = "24";
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualYear,expectedYear,"Actual year vs expected year not Equal");
        Assert.assertEquals(actualMonth,expectedMonth,"Actual month vs expected month not Equal");
        Assert.assertTrue(actualDay.equals(expectedDay));
    }
}
