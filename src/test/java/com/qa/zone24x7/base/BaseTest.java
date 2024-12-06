package com.qa.zone24x7.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;

   @BeforeTest
    public void setup(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://ezp-dev-admin.ezpassport.online/login");
   }

//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }



}
