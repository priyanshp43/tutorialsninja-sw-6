package index.php.demo.com.tutorialsninja.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MacbookPage extends index.php.demo.com.tutorialsninja.utility.Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement qtyBox;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickUpdate;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]")
    WebElement verifyTotal;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement clickCheckoout;

    public void enterQTY() {
        sendTextToElement(qtyBox, "2");
    }

    public void clickupdate() {
        clickOnElement(clickUpdate);
    }

    public String verifyUpdate() {
        String message = getTextFromElement(clickUpdate);
        return message;
    }

    public void clickCechkout() {
        clickOnElement(clickCheckoout);
    }

    public String verifyTotal() {
        String message = getTextFromElement(verifyTotal);
        return message;
    }

}
