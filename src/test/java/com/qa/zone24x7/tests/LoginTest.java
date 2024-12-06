package com.qa.zone24x7.tests;

import com.qa.zone24x7.base.BaseTest;
import org.testng.annotations.Test;
import org.zone24x7.pages.DashBoardPage;
import org.zone24x7.pages.LoginPage;

public class LoginTest extends BaseTest {

    LoginPage loginPage;
    DashBoardPage dashBoardPage;

    @Test
    public void verifyTheSuccessLogin(){
        loginPage = new LoginPage(driver);
        //verify if Login page loaded successfully
        loginPage.enterEmailAddress("Test@123.gmail.com");
        loginPage.enterPassword("123");
        dashBoardPage = loginPage.clickLogin();
    }
}
