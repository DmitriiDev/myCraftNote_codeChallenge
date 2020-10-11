package tests;

import Helpers.Constants;
import PageObject.Main;
import initPoint.CoreTestCase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ExercisesUserFlowTests extends CoreTestCase  {
    public Main MainMethods;

    public void setUp() throws Exception
    {
        super.setUp();
        MainMethods = new Main(driver);
    }


    @Test
    public void test_checkLaunchAndFinishOneExercise() {
        // GIVEN:
        mainDashBoardScreen.clickGoTrainingBtn();
        // WHEN
        preparationTrainScreen.clickReadyButton_dashBoard();
        // THEN
        exerciseScreen.clickStartButton();
        Assert.assertTrue(waitOfStartTrain.isWaitingScreenShown());
        // GIVEN:
        Main.waitForElement(By.id(Constants.runExerccise_execution_type_label),"no progress Label here", 10);
        // THEN
        runExerciseScreen.clickCloseButton();
        runExerciseScreen.clickExitBtnPopUp();
        // WHEN
        mainDashBoardScreen.knowledgeViewGroupIsDispalyed();
    }

}
