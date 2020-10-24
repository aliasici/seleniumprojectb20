package com.cybertek.tests.self_practice.Tasks;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {

        WebElement driver;
        Faker faker=new Faker();
        @BeforeMethod
        public void setDriver() {
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com");
            driver.findElement(By.xpath("//a[@href='/registration_form']")).click();
        }
        /* TC#6: Cybertek registration form confirmation
        Note: Use JavaFaker when possible.
        1. Open browser
        2. Go to website: http://practice.cybertekschool.com/registration_form
        3. Enter first name
        4. Enter last name
        5. Enter username
        6. Enter email address
        7. Enter password
        8. Enter phone number
        9. Select a gender from radio buttons
        10. Enter date of birth
        11. Select Department/Office
        12. Select Job Title
        13. Select programming language from checkboxes
        14. Click to sign up button
        15. Verify success message “You’ve successfully completed registration.” is
        displayed.*/
        @Test
        public void registration() throws NullPointerException{

            WebElement nam=driver.findElement(By.xpath("//input[@class='form-control']"));
            nam.sendKeys(("adam")+ Keys.ENTER);
        }

    }
