package PageObject;

import Helpers.Constants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main {
    public static AppiumDriver driver;

    public Main (AppiumDriver driver)
    {
        this.driver = driver;
    }

    public static WebElement waitForElement(By by, String error_message, long timeOutInSecond)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSecond);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

    public static WebElement waitForElement(By by, String error_message)
    {
        return waitForElement(by, error_message, 5);
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

    public static void waitForPermissionAlertAndAllow()
    {
        WebElement element =  waitForElement(By.id(Constants.permission_location_allow), "Can't find geo permissions allow",5);
        element.click();
    }

    public static String waitForCellElement(String projectName)
    {
        WebElement element =  waitForElement(By.id(Constants.cellProjectList_id), "can't find the cell with name " + projectName,5);
        return element.getText();
    }

    public static boolean waitForElementNotPresentById(By by, String error_message, long timeOutInSecond)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSecond);
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.invisibilityOfElementLocated(by)
        );
    }

    public void simple_swipe(int fromX, int fromY,int toX, int toY)
    {
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(fromX,fromY)).waitAction().moveTo(PointOption.point(toX,toY)).release().perform();
    }
    public static void swipeUp()
    {
        TouchAction action = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();

        int x = size.width/2;

        int start_y = (int)(size.height*0.8);

        int end_y = (int) (size.height*0.2);

        action.press(PointOption.point(x,start_y)).waitAction().moveTo(PointOption.point(x,end_y)).release().perform();
    }
    public static void swipeUpToFindElement(By by, String error_message, int max_swipe)
    {
        int already_swipe = 0;
        while (driver.findElements(by).size() == 0){

            if (already_swipe > max_swipe){
                waitForElement(by,"swipes ended" + " " + error_message);
                return;
            }

            swipeUp();
            ++ already_swipe;
        }
    }
}