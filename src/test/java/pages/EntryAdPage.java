package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntryAdPage extends BasePage {

    @FindBy(xpath = "//div[@class='modal-footer']/p")
    private WebElement closeButton;

    @FindBy(xpath = "//a[@id='restart-ad']")
    private WebElement restartButton;


    public EntryAdPage(WebDriver driver) {
        super(driver);
    }


    public void clickCloseButton(){
        closeButton.click();
    }

    public void clickRestartButton(){
        restartButton.click();
    }
}
