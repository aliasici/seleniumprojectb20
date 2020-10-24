package com.cybertek.tests.bitrix;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class BitrixAC2 {
    /*
    User should be able to add
    users from selecting contact
    from E-mail user, Employees and Departments
    and Recent contact lists
     */

    @Test
    public void AC2(){
        Driver.getDriver().get("https://login2.nextbasecrm.com");
        Driver.getDriver().findElement(By.name("USER_LOGIN")).sendKeys("helpdesk3@cybertekschool.com");
        Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys("UserUser"+ Keys.ENTER);
        // go into Drive in menu left
        Driver.getDriver().findElement(By.xpath("//a[@title='Contact Center']")).click();
        //Drive->My Drive->upload files, selecting uploaded files
//        Driver.getDriver().findElement(By.xpath("//div/i")).click();
//        // clicking on (OPEN) to open  (uploaded files) folder
//        Driver.getDriver().findElement(By.xpath("//*[@class='ui-action-panel-item-title']")).click();
//        Driver.getDriver().manage().window().maximize();
//        //get the path of the file you want to upload
//        //Windows-> SHIFT + RIGHT CLICK --> Copy as path
//        // MAC->  Click and hold "OPTION" button and select "copy as path name"
//        String path = "C:/Users/Beach/Downloads/notes 10_13.txt";
//        //Locate the upload web element
//        //first locate dropdown menu
//        Driver.getDriver().findElement(By.xpath("//*[@id='bx-disk-add-menu']")).click();
//        WebElement uploadInput = Driver.getDriver().findElement(By.xpath("//*[@id='inputContainerLabelFolderList']"));
//        //send the path of the file to uploadInput webElement
//        uploadInput.click();
//        uploadInput.sendKeys(path);

    }

}
