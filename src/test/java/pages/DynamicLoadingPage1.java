package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoadingPage1 extends BasePage {

    @FindBy(xpath = "//div[@id='start']")
    private WebElement startButton;

    @FindBy(xpath = "//div[@id='finish']")
    private WebElement helloWord;

    public DynamicLoadingPage1(WebDriver driver) {
        super(driver);
    }
    public void clickStartButton() {
        startButton.click();
    }

    public boolean helloWord(){
        if (helloWord.isDisplayed())
            return true;
        else return false;
    }
}
