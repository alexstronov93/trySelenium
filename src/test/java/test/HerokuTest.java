package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HerokuTest extends BaseTest {


    private final static String INVALID_USER_NAME = "AAAAAA";
    private final static String INVALID_PASSWORD = "AAAAAA";

    private final static String VALID_USER_NAME = "tomsmith";
    private final static String VALID_PASSWORD = "SuperSecretPassword!";


    @Test
    public void changeCheckBox() {
        getHomePage().clickCheckBoxesMenu();
        getCheckBoxPage().clickCheckBoxButton();
    }

    @Test
    public void dynamicElement() {
        getHomePage().clickEntryAdMenu();
        String title = getDriver().findElement(By.xpath("//div[@class='modal-title']")).getText();
        getBasePage().implicitWait(30);
        Assert.assertEquals(title, "This is a modal window");
        getEntryAdPage().clickCloseButton();
        getEntryAdPage().clickRestartButton();


    }

    @Test
    public void testInvalidLogin() {
        getHomePage().clickLoginMenu();
        getLoginPage().inputLogin(INVALID_USER_NAME);
        getLoginPage().inputPassword(INVALID_PASSWORD);
        getLoginPage().clickLoginButton();
        assertTrue(getLoginPage().isError());

    }

    @Test
    public void testValidLogin() {
        getHomePage().clickLoginMenu();
        getLoginPage().inputLogin(VALID_USER_NAME);
        getLoginPage().inputPassword(VALID_PASSWORD);
        getLoginPage().clickLoginButton();
        String newUrl = getDriver().getCurrentUrl();
        assertEquals(newUrl, "http://the-internet.herokuapp.com/secure");
    }

    @Test
    public void testDynamicLoadingElement() {
        getHomePage().clickDynamicLoadingMenu();
        getDynamicLoadingPage().clickExample1Button();
        getDynamicLoadingPage1().clickStartButton();
        getDriver().manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        assertTrue(getDynamicLoadingPage1().helloWord());
    }

    @Test
    public void testDownloadFile() {
        getHomePage().clickJqueryMenu();
        getJqueryUiPage().clickDownloadButton();

    }
}
