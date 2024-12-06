package org.zone24x7.base;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver UIDriver;
    protected FluentWait<WebDriver> wait;

    public BasePage(WebDriver driver){


        this.UIDriver = driver;
        this.wait = new FluentWait<>(UIDriver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

    }


}
