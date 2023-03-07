package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1- Set up the browser driwer
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the selenium WebDriwer
        WebDriver driver = new ChromeDriver();

        // this line will maximize the browser size
        driver.manage().window().maximize();

        //3- go to "https://tesla.com"
        driver.get("https://tesla.com");

        //get the title  of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //Stop code execution for 3 second
        Thread.sleep(3000);

        // use selenium  to navigate back
        driver.navigate().back();

        //Stop code execution for 3 second
        Thread.sleep(3000);

        driver.navigate().forward();

        //Stop code execution for 3 second
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 second
        Thread.sleep(3000);

        // use navigate().to():
        driver.navigate().to("https://www.google.com");

        //get the current title after getting the google page
        currentTitle = driver.getTitle();


        //System.out.println("driver.getTitle() = " + driver.getTitle());


        System.out.println("currentTitle = " + currentTitle);

        //get the current URL using Selenium
        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        // this will close the currently opened window
        driver.close();

        // this will close all of opened windows
        driver.quit();


    }

}
