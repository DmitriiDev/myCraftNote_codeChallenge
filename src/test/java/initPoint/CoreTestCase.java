package initPoint;

import PageObject.SearchPageObject;
import PageObject.IOSPageObject;
import io.appium.java_client.AppiumDriver;
import junit.framework.TestCase;
import org.junit.Ignore;

/*
 *  Init class for Appium. There is initialization a driver for the ios or android platforms. As I don't have an app for ios
 *  tests always run only on the android platform. iOS just for example.
 *  Also, there are PageObject classes initialization.
 */


@Ignore
public class CoreTestCase extends TestCase {
    public AppiumDriver driver;
    public Platform Platform;
    public SearchPageObject search = new SearchPageObject(driver);
    public IOSPageObject ios = new IOSPageObject(driver);

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