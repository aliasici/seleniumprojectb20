package com.cybertek.tests.day12_review_jsexecuter.pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor_Practices {
    @Test
    public void scroll_using_jsexecutor_1(){
        // Get the page to scroll

        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        //create instance ofJSEecutor and cat our driver type to it

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // use execute script method
        BrowserUtils.wait(1);
        for (int i = 0; i < 10; i++) {
            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(0,500)");
        }

    }

    @Test
    public void scroll_using_jsexecutor_2(){
        // get the page to scroll
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        // locating cybertek school link
        BrowserUtils.wait(2);
        WebElement link = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        // use js executor to scroll 'Cybertek School' link intoView

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        // use scrollIntoView function from JS to scroll to a specific web element

        BrowserUtils.wait(2);
        js.executeScript("arguments[0].scrollIntoView(true)",link);

        BrowserUtils.wait(2);
        js.executeScript("arguments[0].scrollIntoView(true)",homeLink);

    }
    @Test
    public void fill_form_using_javascript(){
        Driver.getDriver().get("http://practice.cybertekschool.com/sign_up");

        WebElement usernameInput =  Driver.getDriver().findElement(By.name("full_name"));

        WebElement emailInput =  Driver.getDriver().findElement(By.name("email"));
        WebElement signUpbutton  =  Driver.getDriver().findElement(By.name("wooden_spoon"));

        BrowserUtils.wait(1);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].setAttribute('value',  'Jane Doe')", usernameInput);
        BrowserUtils.wait(1);

        js.executeScript("arguments[0].setAttribute('value',  'something@gmail.com')", emailInput);
        BrowserUtils.wait(1);

        js.executeScript("arguments[0].click()", signUpbutton);




    }
}