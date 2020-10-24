package com.cybertek.tests.self_practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_AddRemoveElements {
    public static void main(String[] args) throws InterruptedException{
        //XPATHand CSSSelectorPRACTICESDO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        // TC #2: PracticeCybertek.com_AddRemoveElements
        // WebElement verification 1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        // 3. Click to “Add Element” button
        //tagName[.='text']

        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        Thread.sleep(3000);
        addElementButton.click();

        // 4. Verify “Delete” button is displayed after clicking.
         WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        // 5. Click to “Delete” button.



        // 6. Verify “Delete” button is NOT displayed after clicking.
        try{
            deleteButton.click();
            if(deleteButton.isDisplayed()){
                System.out.println("Delete button is displayed. Verification passed!");
            }else{
                System.out.println("Delete button is not displayed Verification failed!!!");
            }

        }catch (StaleElementReferenceException exception){
            System.out.println("StaleElementException has been thrown.");
            System.out.println("It means element has been completely deleted from the HTML.");
            System.out.println("Delete button is not displayed . Verification PASSED!");
        }
        // USE XPATH and/orCSS Selector LOCATOR FOR ALL WEBELEMENT LOCATORS Better if you do with both for practice purposes
        //



    }
}
