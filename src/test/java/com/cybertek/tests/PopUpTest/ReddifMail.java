package com.cybertek.tests.PopUpTest;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ReddifMail {
    @Test
    public void popup1() throws InterruptedException{
        Driver.getDriver().get("https://mail.rediff.com/cgi-bin/login.cgi");
        Driver.getDriver().findElement(By.xpath("//input[@class='signinbtn']")).click();
        Alert alert = Driver.getDriver().switchTo().alert();

        System.out.println("alert = " + alert.getText()); // takes text whatever alert has it
        String message = alert.getText();

        if(message.equals("Please enter a valid user name")){
            System.out.println("Correct message");
        }else{
            System.out.println("It is not correct");
        }
        Thread.sleep(2000);
        alert.accept(); // click on alert button
       //  alert.dismiss(); // this is for cancel
        Driver.getDriver().close();
    }

}
