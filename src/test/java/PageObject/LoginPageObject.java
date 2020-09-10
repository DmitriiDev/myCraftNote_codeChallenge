package PageObject;

import Helpers.Constants;
import org.openqa.selenium.By;


public class LoginPageObject {

    public void login_default()  {

        Main.waitForElementAndClick(
                By.id(Constants.loginBtn_id),
                "can't find the login button",
                15
        );

        Main.waitForElementAndSendKeys(
                By.id(Constants.loginName_Field),
                Constants.login_name,
                "can't find the login field"
        );

        Main.waitForElementAndSendKeys(
                By.id(Constants.password_field),
                Constants.password,
                "can't find the password field"
        );

        Main.waitForElementAndClick(
                By.id(Constants.singIn_btn_id),
                "can't find the sign in button",
                15
        );
    }

    public void login_custom_user(String username, String password)  {

        Main.waitForElementAndClick(
                By.id(Constants.loginBtn_id),
                "can't find the login button",
                15
        );

        Main.waitForElementAndSendKeys(
                By.id(Constants.loginName_Field),
                username,
                "can't find the login field"
        );

        Main.waitForElementAndSendKeys(
                By.id(Constants.password_field),
                password,
                "can't find the password field"
        );

        Main.waitForElementAndClick(
                By.id(Constants.singIn_btn_id),
                "can't find the sign in button",
                15
        );
    }
}
