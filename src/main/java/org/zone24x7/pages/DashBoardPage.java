package org.zone24x7.pages;

import org.openqa.selenium.WebDriver;
import org.zone24x7.base.BasePage;

public class DashBoardPage extends BasePage {
    public DashBoardPage(WebDriver driver) {
        super(driver);
    }

    public void isPageLoaded(){
        System.out.println("Page load successfully");
    }

}
