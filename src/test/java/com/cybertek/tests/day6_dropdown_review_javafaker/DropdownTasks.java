package com.cybertek.tests.day6_dropdown_review_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownTasks {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        // open browser
        driver = WebDriverFactory.getDriver("chrome");

        //maximize page
        driver.manage().window().maximize();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // get the page
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void test2_verify_state_dropdown() throws InterruptedException{
        // we need to locate the dropdown
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        // slect illinois
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        // select virginia BY Value
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

        // select Calfrnia By Index
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);

        // verify final selected option is California

        String expectedResult = "California";
        String actualResult = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualResult,expectedResult,"Actual vs expected is not equal");

    }
    @Test
    public void test3_date_dropdown_verification(){

        //TC #3: Selecting date on dropdown and verifying

        //locate all the web elements/dropdowns
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //3. Select �December 1 , 1921� and verify it is selected.
        //Selecting year using text
        yearDropdown.selectByVisibleText("1921");

        //Selecting month by "value" attribute's value
        monthDropdown.selectByValue("11");

        //Select day 1 by using index
        dayDropdown.selectByIndex(0);

        //creating expected values in one place
        String expectedYear = "1921";
        String expectedMonth = "December";
        String expectedDay = "1";

        //getting our actual values from the web page
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //creating assert lines to compare actual vs expected
        Assert.assertEquals(actualYear, expectedYear, "Actual year vs expected year not equal");
        Assert.assertEquals(actualMonth, expectedMonth, "Actual month vs expected month not equal");
        Assert.assertTrue(actualDay.equals(expectedDay), "Actual day vs expected day not equal");


    }
    @Test
    public void test4_multiple_value_select_dropdown() throws InterruptedException {
//        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
//        List<WebElement> listOption = simpleDropdown.getOptions();
//       // System.out.println(listOption.size());
//        for(WebElement each : listOption){
//            Thread.sleep(3000);
//            each.click();
//        }

        //3. Select all the options from multiple select dropdown.
        // Locate dropdown

        Select multipleSelectDropdown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        // creating a list of web elements to store all of the options inside of this dropdown
        List<WebElement> allOptions = multipleSelectDropdown.getOptions();
        // Loop through the options to select all of them


        for (WebElement eachOption : allOptions) {
            Thread.sleep(1000);
            eachOption.click(); // this will click each option with every iteration

            //4. Print out all selected values.
            System.out.println("Selected: " + eachOption.getText());

            //Asserting the option is actually selected or not
            Assert.assertTrue(eachOption.isSelected(), "The option: " + eachOption.getText() + " is not selected!");

        }

        //5. Deselect all values.
        multipleSelectDropdown.deselectAll();

        for (WebElement eachOption : allOptions) {
            //Assert.assertTrue(!eachOption.isSelected()); //it will be false boolean value, with ! we make it "true"

            // assertFalse method looks for "false" boolean value to pass the test.
            Assert.assertFalse(eachOption.isSelected());
        }
    }
        @Test
        public void test5_html_dropdown_handling(){

            //Locate the HTML dropdown as a regular web element
            WebElement websiteDropdown = driver.findElement(By.xpath("//div[@class='dropdown']/a"));

            //3. Click to non-select dropdown
            websiteDropdown.click();

            //4. Select Facebook from dropdown
            WebElement facebookLink = driver.findElement(By.xpath("//a[.='Facebook']"));
            facebookLink.click();
            //5. Verify title is �Facebook - Log In or Sign Up�

            String actualTitle = driver.getTitle();
            String expectedTitle = "Facebook - Log In or Sign Up";

            Assert.assertEquals(actualTitle,expectedTitle);

        }

    }




