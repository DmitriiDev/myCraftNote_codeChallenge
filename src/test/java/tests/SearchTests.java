package tests;

import PageObject.LoginPageObject;
import PageObject.Main;
import initPoint.CoreTestCase;
import org.junit.Assert;
import org.junit.Test;

public class SearchTests extends CoreTestCase {
    public Main MainMethods;
    LoginPageObject loginPage = new LoginPageObject();

    public void setUp() throws Exception
    {
        super.setUp();
        MainMethods = new Main(driver);
    }

    @Test
    public void test_search_and_clear()  {
        loginPage.login_default();
        Main.waitForPermissionAlertAndAllow();
        search.searchInputExecution("Another");
        Main.waitForCellElement("Another Test");
        Assert.assertEquals(Main.waitForCellElement("Another Test"), "Another Test");
        search.clearInputField();
        search.searchInputExecution("Unternehmens-Chat");
        Assert.assertEquals(Main.waitForCellElement("Unternehmens-Chat"), "Unternehmens-Chat");
    }

}
