package index.php.demo.com.tutorialsninja.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends index.php.demo.com.tutorialsninja.utility.Utility {

    //By welcomeText = By.xpath("");
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    //  By emailField = By.id("Email");
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    //    By passwordField = By.name("Password");
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    //    By loginButton = By.xpath("//input[@value = 'Log in']");
    @CacheLookup
    @FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]")
    WebElement loginButton;

    //    By errorMessage = By.xpath("//div[@class = 'validation-summary-errors']");
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement verifyReturnText;


    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        return message;
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        return message;
    }
    public String verifyreturnText() {
        String message = getTextFromElement(verifyReturnText);
        return message;
    }





}
