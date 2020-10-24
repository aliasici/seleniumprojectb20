package com.cybertek.tests.day12_review_jsexecuter.pom;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class PageObjectModelPractice {
    @Test
    public void login_to_smartbear(){
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        LoginPage loginPage = new LoginPage();

        loginPage.usernameInput.sendKeys("Tester");
    }
}
