package com.cybertek.tests.self_practice;
/*
  What is Maven?
  Maven is built automation tool
  Maven helps us automate creating projects
  When we create a project with maven following things happen
        #1- pre-configured folder structure is created
        project name
            => src folder
                main==> folder: is used by developer
                test==> folder is used by developer create for unit test
        #2- pom.xml file comes with thw project
        pom.xml is most important file im a Maven p.
        We manage our dependencies from our pom.xml file
        it helps us add and maintain the version of our dependencies

        ==> java version 8
        selenium version 3.141.59
        WebDriverManager version 4.1.0

        What is built?
        creating folder structure
        compile
        add jat file, dependencies
        deploying

        Built is the repeated processes when you are creating project

        Is maven for tester? NO

 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) {
        //TC #1: Google title verification
        // 1. open chrome browser
        // set up the browser driver

        WebDriverManager.chromedriver().setup();

        //if you are using browser drivers locally,
        //you need to use System.setProperty everytime
        //we use WebDriverManager

        //open a chrome browser
        //we create an instance of the ChromeDriver, which also opens an empty browser for us
        WebDriver driver = new ChromeDriver();

        // 2. go to https://www.google.com

        driver.get("https://www.google.com");

        // 3 verify title
        //expected : Google

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!!");
        }



    }

}
