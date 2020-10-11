package PageObject;

import Helpers.Constants;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ExerciseScreenObject extends Main {

    public ExerciseScreenObject(AppiumDriver driver)
    {
        super(driver);
    }

    public void clickStartButton() {
        this.waitForElementAndClick(By.id("start_button"), "no GO button here", 5);

    }

    public Integer countOfSets() {
       WebElement set_webElement = this.waitForElement(By.id(Constants.exerciseScreen_set_number), "");
        return Integer.parseInt(set_webElement.getText());
    }

    public Integer countOfRepetition() {
        WebElement repetitions = this.waitForElement(By.id(Constants.exerciseScreen_repetition_number_text), "");
        return Integer.parseInt(repetitions.getText());
    }


}