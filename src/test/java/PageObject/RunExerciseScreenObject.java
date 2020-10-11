package PageObject;

import Helpers.Constants;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RunExerciseScreenObject extends Main {

    public RunExerciseScreenObject(AppiumDriver driver)
    {
        super(driver);
    }


    public WebElement progressLabel() {
        return  this.waitForElement(By.id(Constants.runExerccise_mainProgressText), "no progress");

    }

    public Integer progressOfExerciseInteger() {
        WebElement progress = progressLabel();
        return Integer.parseInt(progress.getText());
    }

    public void clickStartButton() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath("//android.widget.Button[contains(@resource-id, 'start_button')]")));

    }

    public void clickCloseButton() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath("//android.widget.ImageButton[contains(@resource-id, 'close_button')]"))).click();
    }

    public void clickExitBtnPopUp() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath("//android.widget.Button[contains(@resource-id, 'skip')]"))).click();
    }
}
