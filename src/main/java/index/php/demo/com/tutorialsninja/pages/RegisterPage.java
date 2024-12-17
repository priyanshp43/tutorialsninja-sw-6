package index.php.demo.com.tutorialsninja.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends index.php.demo.com.tutorialsninja.utility.Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "input-firstName")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(id = "input-lastName")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement enterConfirmPasssword;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement enterTelephone;

    @CacheLookup
    @FindBy(xpath = "//fieldset[3]//input")
    WebElement clickYesOnRadio;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement policyBox;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement clickContinue;


    public String verifyRegisterText() {
        String message = getTextFromElement(registerText);
        return message;
    }

    public void enterFirstName(String name) {
        sendTextToElement(enterFirstName, name);

    }

    public void enterLastName(String lastname) {
        sendTextToElement(enterLastName, lastname);

    }

    public void enterEmail(String email) {
        sendTextToElement(enterEmail, email);

    }

    public void enterPassword(String password) {
        sendTextToElement(enterPassword, password);

    }

    public void enterConfirmPassword(String confirmpassword) {
        sendTextToElement(enterConfirmPasssword, confirmpassword);

    }

    public void entertelehpone(String telephone) {
        sendTextToElement(enterTelephone, telephone);

    }

    public void radioYes() {
        clickOnElement(clickYesOnRadio);
    }

    public void tickPolicyBox() {
        clickOnElement(policyBox);
    }

    public void clickContinue() {
        clickOnElement(clickContinue);
    }
}

