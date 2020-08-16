package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage {

    @FindBy(xpath = "//*[@id='checkboxes']/input[1]")
    private WebElement checkBox1Button;


    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public void clickCheckBoxButton(){
        checkBox1Button.click();
    }


}
