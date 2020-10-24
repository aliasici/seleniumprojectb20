package com.cybertek.tests.PopUpTest;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ReddifMail_2 {
    @Test
    public void username_password()throws InterruptedException{
        Driver.getDriver().get("https://mail.rediff.com/cgi-bin/login.cgi");

        Driver.getDriver().findElement(By.xpath("//input[@id='login1']")).sendKeys("abuziddin");
        Thread.sleep(2000);

        Driver.getDriver().findElement(By.xpath("//input[@class='signinbtn']")).click();

        Thread.sleep(2000);

        Alert alert = Driver.getDriver().switchTo().alert();
        System.out.println("alert = " + alert.getText()); // takes text whatever alert has it
        String message = alert.getText();


    }
}
