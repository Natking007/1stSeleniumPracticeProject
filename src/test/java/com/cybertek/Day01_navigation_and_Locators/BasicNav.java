package com.cybertek.Day01_navigation_and_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNav {

    public static void main(String[] args) {

        // setup chrome driver
            WebDriverManager.chromedriver().setup();
        //        // create ChromeDriver Object
                WebDriver driver = new ChromeDriver();
        //        // navigate to https://yahoo.com
                driver.get("https://yahoo.com");
        //         /* navigate using
        //            - get("url")
        //            - navigate().to("url")
        //            - navigate().back()
        //            - navigate().forward()
        //            - navigate().refresh()
        //        *
        //        * */
        //


        // navigate().to("url")
                driver.navigate().to("https://google.com/");
        // navigate().back()
        driver.navigate().back();
        // navigate().forward()
        driver.navigate().forward();

        // closing browser
        /*
         * close() method , will close current tab
         * quit() method , will close all tabs if there is more than one
         * */
        //driver.close();  will close current tab
        driver.quit();// will close all tabs

    }
}
