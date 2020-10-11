package initPoint;

import PageObject.*;
import io.appium.java_client.AppiumDriver;
import junit.framework.TestCase;

/*
 *  Init class for Appium. There is initialization a driver for the ios or android platforms. As I don't have an app for ios
 *  tests always run only on the android platform. iOS just for example.
 *  Also, there are PageObject classes initialization.
 */


//@Ignore
public class CoreTestCase extends TestCase {
    public AppiumDriver driver;
    public Platform Platform;
    public IOSPageObject ios = new IOSPageObject(driver);
    public MainDashBoardScreenObject mainDashBoardScreen = new MainDashBoardScreenObject(driver);
    public PreparationForTrainingScreenObject preparationTrainScreen = new PreparationForTrainingScreenObject(driver);
    public ExerciseScreenObject exerciseScreen = new ExerciseScreenObject(driver);
    public WaitingScreenObject waitOfStartTrain = new WaitingScreenObject(driver);
    public RunExerciseScreenObject runExerciseScreen = new RunExerciseScreenObject(driver);


    @Override
    public void setUp() throws Exception
    {
        super.setUp();
        this.Platform = new Platform();
        driver = this.Platform.getDriver();
    }
    @Override
    public void tearDown() throws Exception
    {
        driver.quit();
        super.tearDown();
    }
}