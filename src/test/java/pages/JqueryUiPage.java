package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JqueryUiPage extends BasePage {

    @FindBy(xpath = "//ul[contains(@class, 'ui-menu ui-widget ui-widget-content ui-corner-all')]//a[contains(@id,'ui-id-2')]")
    private WebElement enabledButton;

    @FindBy(xpath ="//ul[contains(@class, 'ui-menu ui-widget ui-widget-content ui-corner-all')]//a[contains(@id,'ui-id-4')]" )
    private WebElement downloadsButton;
    @FindBy(xpath = "//ul[contains(@class, 'ui-menu ui-widget ui-widget-content ui-corner-all')]//a[contains(@id,'ui-id-8')]")
    private WebElement excelButton;


    public JqueryUiPage(WebDriver driver) {
        super(driver);
    }

    public void clickDownloadButton(){
        enabledButton.click();
        downloadsButton.click();
        excelButton.click();
    }
}
