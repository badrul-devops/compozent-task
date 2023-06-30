package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/badrulalam/Downloads/chromedriver");

   WebDriver driver = new ChromeDriver () ;
driver.manage () .window () .maximize () ;
driver.get ("https://the-internet.herokuapp.com/inputs");
WebElement textAreaField = driver.findElement (By. id("content"));
textAreaField.sendKeys ("123");

    }

}
    