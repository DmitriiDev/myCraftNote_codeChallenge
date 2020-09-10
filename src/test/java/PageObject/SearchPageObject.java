package PageObject;

import Helpers.Constants;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SearchPageObject extends Main{
    public SearchPageObject(AppiumDriver driver)
    {
        super(driver);
    }

    public void searchInputExecution(String search_value) {
        this.waitForElementAndSendKeys(By.id(Constants.searchInput_id), search_value, "can't find the input field", 5);

        WebElement element =  waitForElement(By.id(Constants.searchInput_id), "error_message",14);
        element.click();

        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Search"));

    }

    public void clearInputField() {
        this.waitForElementAndClick(By.id(Constants.clearInput_id),"can't find the clear btn", 5);
    }

}