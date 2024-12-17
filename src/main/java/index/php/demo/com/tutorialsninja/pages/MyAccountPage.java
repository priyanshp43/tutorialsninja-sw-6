package index.php.demo.com.tutorialsninja.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends index.php.demo.com.tutorialsninja.utility.Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement verifyYourAccountHasBeenCreatedText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement clickContiue;

    @CacheLookup
    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]")
    WebElement logoutText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickContiue1;


    public String setVerifyYourAccountHasBeenCreatedText() {
        String message = getTextFromElement(verifyYourAccountHasBeenCreatedText);
        return message;
    }

    public void clickContinue() {
        clickOnElement(clickContiue);
    }

    public String setVerifyLogOutText() {
        String message = getTextFromElement(logoutText);
        return message;
    }

    public void clickContinue1() {
        clickOnElement(clickContiue1);
    }
}
