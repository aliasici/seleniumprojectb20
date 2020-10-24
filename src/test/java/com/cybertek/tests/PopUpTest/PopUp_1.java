package com.cybertek.tests.PopUpTest;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class PopUp_1 {
    @Test
    public void popup1() throws InterruptedException{
      Driver.getDriver().get("http://www.popuptest.com/goodpopups.html");
      //  Driver.getDriver().get("https://www.apple.com");
      Driver.getDriver().findElement(By.xpath("/html[1]/body/table[2]/tbody/tr/td/font/b/a[3]")).click();

      Thread.sleep(2000);

      Set<String> handler =Driver.getDriver().getWindowHandles();

        Iterator<String> it = handler.iterator();
        String parentWindowId = it.next();

        System.out.println("parent window id: "+parentWindowId);
        String childSWindowId = it.next();
        System.out.println("Child window id: "+childSWindowId);

        Driver.getDriver().switchTo().window(childSWindowId);
        Thread.sleep(2000);
        System.out.println("Child window pop up title: "+Driver.getDriver().getTitle());
        Driver.getDriver().close();

        Driver.getDriver().switchTo().window(parentWindowId);
        Thread.sleep(2000);
        System.out.println("Parent window title: "+Driver.getDriver().getTitle());

    }

}
