package com.cybertek.tests.self_practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Apple_FindElements {
    public static void main(String[] args) throws InterruptedException {
        //TC #03: FINDELEMENTS_APPLE
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.apple.com
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.apple.com");
        //Creating counters: emptyLinks, and links with text
        int emptyLinkCounter = 0;
        int linksWithText = 0;
        Thread.sleep(500);
        //3. Click to all of the headers one by one
        // a. Mac, iPad, iPhone, Watch, TV, Music, Support
        // Creating List of WebElements to store all the links in the header list.
        List<WebElement> appleHeader = driver.findElements(By.xpath("//ul[@class='ac-gn-list']/li/a"));

        //The loop where we specify where to start from and where to end in appleHeader List.
        for (int i = 1; i < 8; i++) {
            appleHeader.get(i).click();
            Thread.sleep(1000);
            List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
            // 4. Print out how many links on each page with the titles of the pages
            System.out.println("Number of links on page: " + driver.getTitle() + " " + listOfLinks.size());
            //texts of links
            // 5. Loop through all
            // 6. Print out how many link is missing text TOTAL
            // 7. Print out how many link has text TOTAL
            // 8. Print out how many total link TOTAL
            for (WebElement link : listOfLinks) {

                String textOfLink = link.getText();
                if (!textOfLink.isEmpty()) {
                    //System.out.println(textOfLink);
                    linksWithText++;
                } else {
                    emptyLinkCounter++;
                }

            }
             driver.navigate().back();
            appleHeader = driver.findElements(By.xpath("//ul[@class='ac-gn-list']/li/a"));
        }
            System.out.println(emptyLinkCounter);
            System.out.println(linksWithText);

        /*
        Number of links on page: Mac - Apple 224
Number of links on page: iPad - Apple 175
Number of links on page: iPhone - Apple 197
Number of links on page: Watch - Apple 167
Number of links on page: TV - Apple 137
Number of links on page: Music - Apple 142
Number of links on page: Official Apple Support 76
264
854

         */



    }

}
