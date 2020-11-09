package com.cybertek.tests.self_practice.cybertek_practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Cybertek_ForgotPassword_Xpath {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        // //a[.='Home'] with text
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));

        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        // E-mail input box
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));

        // Retrieve password button
        WebElement reteieveButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        WebElement footerText = driver.findElement(By.xpath("//a[.='Cybertek School']"));

        // verify all web elements are displayed
        if(homeLink.isDisplayed() && forgotPasswordHeader.isDisplayed()
        && emailLabel.isDisplayed() && emailInput.isDisplayed() && reteieveButton.isDisplayed()
        && footerText.isDisplayed()){
            System.out.println("All of the webElements are displayed. PASS!");
        }else {
            System.out.println("One or more of the webElements are not displayed, FAILED!!!");
        }

    }



}
