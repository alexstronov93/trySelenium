package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoadingPage extends BasePage {

    @FindBy(xpath = "//a[@href='/dynamic_loading/1']")
    private WebElement example1Button;




    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    public void clickExample1Button() {
        example1Button.click();
    }


}
