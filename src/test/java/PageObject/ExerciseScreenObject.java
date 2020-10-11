package PageObject;

import Helpers.Constants;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ExerciseScreen extends Main {

    public ExerciseScreen(AppiumDriver driver)
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

    public void clickGoTrainingBtn() {
        this.waitForElementAndClick(By.id("my_training_arrow"), "no GO button here", 5);
    }

    public void clickReadyButton() {
        this.waitForElementAndClick(By.id("ready_button"), "no GO button here", 5);

    }

    public void clickStartButton() {
        this.waitForElementAndClick(By.id("start_button"), "no GO button here", 5);

    }

    public Integer countOfSets() {
       WebElement ff = this.waitForElement(By.id(Constants.exerciseScreen_set_number), "");
        return Integer.parseInt(ff.getText());
    }

    public Integer countOfRepetition() {
        WebElement repetitions = this.waitForElement(By.id(Constants.exerciseScreen_repetition_number_text), "");
        return Integer.parseInt(repetitions.getText());
    }

    public void qq() {
        MobileElement el4 = (MobileElement) driver.findElementById("com.casparhealth.android.patient:id/duration_text");
        el4.click();
    }

    public void qaz() {
        MobileElement el6 = (MobileElement) driver.findElementById("com.casparhealth.android.patient:id/get_ready_text");
        el6.click();
    }

}