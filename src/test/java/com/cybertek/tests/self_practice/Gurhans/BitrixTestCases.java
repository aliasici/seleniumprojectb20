package com.cybertek.tests.self_practice.Gurhans;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class BitrixTestCases {
    @BeforeMethod
    public void setMethod() throws InterruptedException {
        Driver.getDriver().get("https://login2.nextbasecrm.com/stream/");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement userName = Driver.getDriver().findElement(By.name("USER_LOGIN"));
        WebElement password = Driver.getDriver().findElement(By.name("USER_PASSWORD"));
        userName.sendKeys("helpdesk3@cybertekschool.com");
        Thread.sleep(1000);
        password.sendKeys("UserUser");
        Thread.sleep(1000);
        WebElement submit = Driver.getDriver().findElement(By.xpath("//input[@type='submit']"));
        submit.click();
    }
    @Test
    public void topicAboveMessageBox() throws InterruptedException {
        WebElement message = Driver.getDriver().findElement(By.xpath("//span[.='Message']"));
        message.click();
        WebElement topicIcon = Driver.getDriver().findElement(By.id("lhe_button_title_blogPostForm"));
        Thread.sleep(1000);
        topicIcon.click();
        WebElement topic = Driver.getDriver().findElement(By.id("POST_TITLE"));
        Thread.sleep(1000);
        boolean expectedMessage = topic.isDisplayed();
        Assert.assertTrue(expectedMessage);
    }
    @Test
    public void deadLine() throws InterruptedException {
        // find and click Task bar on top raw
        WebElement taskIcon = Driver.getDriver().findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        Thread.sleep(500);
        taskIcon.click();
        // finding and clicking on deadline calender selector
        WebElement calender = Driver.getDriver().findElement(By.xpath("//input[@class='task-options-inp']"));
        Thread.sleep(500);
        calender.click();
        // find and select the day i know by default the month October and year 2020 is selected so in this case
        //  i only worry about the day.  (Oct, 5 2020)
        WebElement day = Driver.getDriver().findElement(By.xpath("//a[@data-date='1601856000000']"));
        Thread.sleep(500);
        day.click();
        // find and click to select button
        WebElement select = Driver.getDriver().findElement(By.xpath("(//span[@class='bx-calendar-button-text'])[1]"));
        Thread.sleep(500);
        select.click();
        // make sure 10/05/2020 07:00 pm is displayed in deadline
        Assert.assertTrue(calender.isDisplayed(),"10/05/2020 07:00 pm");
    }
    @Test
    public void eventLocationDropdown() throws InterruptedException {
//        WebElement dateDropdown = driver.findElement(By.LOCATOR);
//        Select select = new Select(dateDropdown);
        WebElement event = Driver.getDriver().findElement(By.id("feed-add-post-form-tab-calendar"));
        Thread.sleep(500);
        event.click();
        WebElement locationDropdown = Driver.getDriver().findElement(By.xpath("//input[@id='event-locationcal_3Jcl']"));
        Thread.sleep(500);
        locationDropdown.click();
        Thread.sleep(500);
        // since it is not Select dropdown the only way we can put location is by writing it down
        locationDropdown.sendKeys("East Meeting Room");
        System.out.println("East Meeting Room"+locationDropdown.getText());
    }
}