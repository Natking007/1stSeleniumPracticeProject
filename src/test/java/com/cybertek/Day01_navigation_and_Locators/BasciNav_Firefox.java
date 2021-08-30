package com.cybertek.Day01_navigation_and_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasciNav_Firefox {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://cybertekschool.com");

        System.out.println("About to quit");

        driver.quit();

    }
}
