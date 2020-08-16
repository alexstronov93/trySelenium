package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(xpath = "//a[text()='Checkboxes']")
    private WebElement checkBoxesButton;

    @FindBy(xpath = "//a[text()='Entry Ad']")
    private WebElement entryAdButton;

    @FindBy(xpath = "//a[text()='Form Authentication']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[text()='Dynamic Loading']")
    private WebElement dynamicLoadingButton;

    @FindBy(xpath = "//a[text()='JQuery UI Menus']")
    private WebElement jQueryMenuButton;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickCheckBoxesMenu(){
        checkBoxesButton.click();
    }

    public void clickEntryAdMenu(){
        entryAdButton.click();
    }

    public void clickLoginMenu(){
        loginButton.click();
    }

    public void clickDynamicLoadingMenu(){
        dynamicLoadingButton.click();
    }

    public void clickJqueryMenu(){
        jQueryMenuButton.click();
    }

}
