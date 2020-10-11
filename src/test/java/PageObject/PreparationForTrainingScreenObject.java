package PageObject;

import Helpers.Constants;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class PreparationForTrainingScreenObject extends Main {

    public PreparationForTrainingScreenObject(AppiumDriver driver)
    {
        super(driver);
    }

    public void clickReadyButton_dashBoard() {
        this.waitForElementAndClick(By.id(Constants.planOfExercises_ready_button), "no I'm ready button here", 5);
    }

}
