package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

public class BaseTest {

    private WebDriver driver;
    private static final String URL = "http://the-internet.herokuapp.com/";


    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public DynamicLoadingPage getDynamicLoadingPage() {
        return new DynamicLoadingPage(getDriver());
    }

    public EntryAdPage getEntryAdPage() {
        return new EntryAdPage(getDriver());
    }

    public JqueryUiPage getJqueryUiPage() {
        return new JqueryUiPage(getDriver());
    }

    public LoginPage getLoginPage() {
        return new LoginPage(getDriver());
    }

    public CheckBoxPage getCheckBoxPage() {
        return new CheckBoxPage(getDriver());
    }

    public DynamicLoadingPage1 getDynamicLoadingPage1() {
        return new DynamicLoadingPage1(getDriver());
    }
}
