package com.cybertek.tests.self_practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T4_SeleniumEasy_Task2 {
    public static void main(String[] args) {
        //TC #3: SeleniumEasy Checkbox Verification �Section 21.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        // 3.Verify �Check All� button text is �Check All�

        WebElement checkAllButton = driver.findElement(By.xpath("//input[@id='check1']"));
        String actualText = checkAllButton.getAttribute("value");
        String exceptedText = "Check All";

        if(actualText.equals(exceptedText)){
            System.out.println("Button text verification passed!");
        }else {
            System.out.println("Button text verification is failed!!!");
        }
        // 4.Click to �Check All� button
        checkAllButton.click();


        // 5.Verify all check boxes are checked6.Verify button text changed to �Uncheck All�
        List<WebElement> checkboxList = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for(WebElement checkbox : checkboxList){
            if(checkbox.isSelected()){
                System.out.println("Checkbox is selected; PASS!");
            }else{
                System.out.println("Checkbox is NOT selected. FAILED!!!");
            }
        }
        //6. verify button text changed to "Unlocked All"
        String actualButtonTextAfterClick = checkAllButton.getAttribute("value");
        String exceptedValueAfterClick = "Uncheck All";

        if(actualButtonTextAfterClick.equals(exceptedValueAfterClick)){
            System.out.println("Final verification PASSED!");
        }else{
            System.out.println("Final verification FAILED!!!");
        }



    }
}
