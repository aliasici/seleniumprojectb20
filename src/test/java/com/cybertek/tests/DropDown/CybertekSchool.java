package com.cybertek.tests.DropDown;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CybertekSchool {
    @Test
    public void cybertek() throws InterruptedException{
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");

        Thread.sleep(2000);
       Select dropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='dropdown']")));
       dropdown.selectByValue("1");
        Thread.sleep(2000);
       Select yearDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='year']")));
       yearDropdown.selectByValue("1995");
        Thread.sleep(2000);
        Select monthDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='month']")));
        monthDropdown.selectByValue("7");
        Thread.sleep(2000);
        Select dayDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='day']")));
        dayDropdown.selectByValue("19");
        Thread.sleep(2000);
        Select state = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='state']")));

        state.selectByValue("CA");
        Thread.sleep(2000);

        WebElement menu = Driver.getDriver().findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        menu.click();
        Thread.sleep(2000);
        WebElement website = Driver.getDriver().findElement(By.cssSelector("a[href='https://www.facebook.com/']"));
        website.click();
        Thread.sleep(2000);
        WebElement facebook = Driver.getDriver().findElement(By.xpath("//a[@id='u_0_2']"));
        facebook.click();

        Thread.sleep(2000);
        Select dropdownMonth = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='month']")));

        dropdownMonth.selectByValue("7");

        Thread.sleep(2000);

        Select dropdownDay= new Select(Driver.getDriver().findElement(By.xpath("//select[@id='day']")));
        dropdownDay.selectByValue("30");


        Thread.sleep(2000);
        Select dropdownYear= new Select(Driver.getDriver().findElement(By.xpath("//select[@id='year']")));

        dropdownYear.selectByValue("1999");
    }
}
