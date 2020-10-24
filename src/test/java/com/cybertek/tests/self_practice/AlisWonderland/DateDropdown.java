package com.cybertek.tests.self_practice.AlisWonderland;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class DateDropdown {
    //: Selecting date on dropdown and verifying
    // 1.Open Chrome browser
    // 2.Go to http://practice.cybertekschool.com/dropdown
    // 3.Select “December 1st, 1921” and verify it is selected.Select year using:
    // visible textSelect month using : value attributeSelect day using: index number
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
}
