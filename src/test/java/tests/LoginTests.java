package tests;
import Helpers.Constants;
import PageObject.Main;
import PageObject.LoginPageObject;
import initPoint.CoreTestCase;
import org.junit.Test;
import org.openqa.selenium.By;


public class LoginTests extends CoreTestCase {

    public Main MainMethods;
    LoginPageObject loginPage = new LoginPageObject();

    public void setUp() throws Exception
    {
        super.setUp();
        MainMethods = new Main(driver);
    }


    @Test
    public void test_login_positive_scenario()  {
        loginPage.login_default();
    }

    @Test
    public void test_login_wrong_email_password()  {

        loginPage.login_custom_user("fakeLogin", "fakePass");

        Main.waitForElementAndClick(
                By.id(Constants.ok_error_alert),
                "can't find ok button",
                15
        );

    }

    @Test
    public void test_login_empty_login_password_fields()  {

        loginPage.login_custom_user("", "");

        Main.waitForElementAndClick(
                By.id(Constants.ok_error_alert),
                "can't find ok button",
                15
        );

    }

}
