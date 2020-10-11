package PageObject;

import Helpers.Constants;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainDashBoardScreenObject extends Main {

    public MainDashBoardScreenObject(AppiumDriver driver)
    {
        super(driver);
    }

    public void clickGoTrainingBtn() {
        this.waitForElementAndClick(By.id(Constants.mainDashBoard_my_training_arrow), "no GO button here", 5);
    }

    public boolean knowledgeViewGroupIsDispalyed() {
        WebElement knowledge_groupView = this.waitForElement(By.id(Constants.mainDashBoard_knowledge), "no progress");
     return knowledge_groupView.isDisplayed();
    }

}
