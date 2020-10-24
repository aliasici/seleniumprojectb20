package com.cybertek.tests.self_practice.Sprint1_AC3;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sprint1_AC3 {
    WebDriver driver;
    String URL = "https://login2.nextbasecrm.com/";
    String userName = "helpdesk3@cybertekschool.com";
    String password = "UserUser";
    String userNameLocator = "//input[@class='login-inp']";
    String passwordLocator = "//input[@name='USER_PASSWORD']";
    String logInLocator = "//input[@type='submit']";
    String activityStreamLocator = "//a[contains(@title,'Activity Stream')]";
    String taskLocator = "//span[@id='feed-add-post-form-tab-tasks']/span";
    String createdByLocator = "//span[@class='task-dashed-link task-dashed-link-add tasks-additional-block-link']//span[1]";
    String createdByText = "//*[@id=\"bx-component-scope-lifefeed_task_form\"]//div[3]/div[1]/div[2]/div/span[2]";
    String addMention = "//span[@id='bx-b-mention-task-form-lifefeed_task_form']";
    String classAddMention = "//span[@class='feed-add-post-form-but feed-add-mention']";
    String link = "//span[@class='bx-finder-groupbox-content']/a/div[3]/div";
    String thingsToDoText = "//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']";
    String sendButton = "//button[@id='blog-submit-button-save']";
    String taskHasDisplayed = "//div[@class='feed-create-task-popup-description']";
    /*
       ////////////////////////////////////////////////////////////////////////////
           This TestNG method will test the AC which is below
           User should be able to add mention by clicking on the Add mention
           icon and select contacts from the lists provided in dropdown.
       ////////////////////////////////////////////////////////////////////////////
       */
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(URL);
        BrowserUtils.wait(1);
    }
    @Test
    public void verify_login_functionality() {
        driver.findElement(By.xpath(userNameLocator)).sendKeys(userName);
        BrowserUtils.wait(1);
        driver.findElement(By.xpath(passwordLocator)).sendKeys(password);
        driver.findElement(By.xpath(logInLocator)).click();
        BrowserUtils.wait(1);
    }
    @Test
    public void verify_task_createdBy_function() {
        verify_login_functionality();
        driver.findElement(By.xpath(activityStreamLocator)).click();
        BrowserUtils.wait(2);
        driver.findElement(By.xpath(taskLocator)).click();
        BrowserUtils.wait(2);
        driver.findElement(By.xpath(createdByLocator)).click();
        BrowserUtils.wait(2);
        Assert.assertTrue(driver.findElement(By.xpath(createdByText)).isDisplayed(), " Test FAILED!");
        BrowserUtils.wait(2);
    }
    @Test
    public void verify_add_mention_function() {
        verify_login_functionality();
        driver.findElement(By.xpath(activityStreamLocator)).click();
        BrowserUtils.wait(1);
        // finding the element "Task"  module using the xpath and resign to task
        // click on the "Task"  module
        driver.findElement(By.xpath(taskLocator)).click();
        // waiting for 3 second
        BrowserUtils.wait(3);
        // finding the element "Add Mention"  link using the xpath and resign to Add mention
        // click on the "Add mention"  link
        WebElement add = driver.findElement(By.xpath(addMention));
        add.click();
        BrowserUtils.wait(3);
        Assert.assertTrue(add.isDisplayed(), " Test FAILED!!");
    }
    @Test
    public void verify_send_button_clickable() {
        verify_login_functionality();
        driver.findElement(By.xpath(activityStreamLocator)).click();
        // waiting for 2 second
        BrowserUtils.wait(2);
        // finding the element "Task"  module using the xpath and resign to task
        // click on the "Task"  module
        driver.findElement(By.xpath(taskLocator)).click();
        // waiting for 2 second
        BrowserUtils.wait(2);
        // finding the element "Add Mention"  link using the xpath and resign to Add mention
        // click on the "Add mention"  link
        driver.findElement(By.xpath(addMention)).click();
        // waiting for 2 second
        BrowserUtils.wait(2);
        driver.findElement(By.xpath(link)).click();
        // waiting for 2 second
        BrowserUtils.wait(2);
        // finding the element "Things to do" text box using the xpath locator and pass the "ashe" text into it
        driver.findElement(By.xpath(thingsToDoText)).sendKeys("ashe");
        // waiting for 2 second
        BrowserUtils.wait(2);
        // finding the element "Send"  link using the xpath and resign to link
        // click on the "Send" link
        driver.findElement(By.xpath(sendButton)).click();
        // Assertion which verify the task has been done
        WebElement taskHasBeenCreated = driver.findElement(By.xpath(taskHasDisplayed));
        Assert.assertTrue(taskHasBeenCreated.isDisplayed(), " Test FAILED!!!");
    }
    @AfterMethod
    public void after_method() {
        // waiting for 3 second
        BrowserUtils.wait(3);
        driver.close();
    }


}
