package org.zone24x7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.zone24x7.base.BasePage;

public class LoginPage extends BasePage {
    //WebElement element = driver.findE

    private final By email_Txt = By.xpath("//input[@name='userName']");
    //private final By email_Txt = By.name("userName");
    private final By password_Txt =By.xpath("//input[@name='password']");
    private final By login_Button = By.xpath("//button[@type='submit']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //page interaction methods
    public void enterEmailAddress(String email){
        UIDriver.findElement(email_Txt).sendKeys(email);
    }

    public void enterPassword(String password){
        UIDriver.findElement(password_Txt).sendKeys(password);
    }

    public DashBoardPage clickLogin(){
        UIDriver.findElement(login_Button).click();
        return new DashBoardPage(UIDriver);
    }
    //methods should have single responsibilities

}
