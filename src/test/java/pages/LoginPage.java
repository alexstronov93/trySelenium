package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//div[@id='flash']")
    private WebElement flashMassage;

    @FindBy(xpath = "//i[@class='fa fa-2x fa-sign-in']")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputLogin(String login){
        usernameField.clear();
        usernameField.sendKeys(login);
    }

    public void inputPassword(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public boolean isError(){
        if (flashMassage.isDisplayed()){
            return true;
        }
        else return false;
    }

}
