package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_2 {

    public static void main(String[] args) {

        //TC #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank"
        /*WebElement getHeader = driver.findElement(By.tagName("h3"));
        String actualHeader = getHeader.getText();
        String expectedHeader = "Log in to ZeroBank";
        System.out.println(actualHeader);

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Test is passed!");
        }else {
            System.out.println("Test is failed!!!");
        }

        driver.close();*/

    }

}
