package PageObject;

import Helpers.Constants;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;


public class Main {

    public static AppiumDriver driver;

    public Main (AppiumDriver driver)
    {
        this.driver = driver;
    }

    public static WebElement waitForElement(By by, String error_message, long timeOutInSecond)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSecond);
        wait.withMessage(error_message + "wait WebElement with timeOut");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

    public static WebElement waitForElement(By by, String error_message)
    {
        return waitForElement(by, error_message, 10);
    }

    public static void waitForElementAndClick(By by, String error_message, long timeOutInSecond)
    {
        WebElement element =  waitForElement(by, error_message,timeOutInSecond);
        element.click();

    }

    public WebElement waitForElementAndSendKeys(By by, String value, String error_message, long timeOutInSecond) {
        WebElement element =  waitForElement(by, error_message,timeOutInSecond);
        element.sendKeys(value);
        return element;
    }

    public static WebElement waitForElementAndSendKeys(By by, String value, String error_message)
    {
        WebElement element =  waitForElement(by, error_message,5);
        element.sendKeys(value);
        return element;
    }
}