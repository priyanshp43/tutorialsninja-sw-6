package index.php.demo.com.tutorialsninja.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends index.php.demo.com.tutorialsninja.utility.Utility {

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooksLink;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentLink;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currancyDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'£Pound Sterling')]")
    WebElement poundLink;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccountLink;




    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    public void clickOnDesktop() {
        clickOnElement(desktopLink);

    }

    public void mouseHoverOnLaptopsAndNotebooks() {
       clickOnElement(laptopsAndNotebooksLink);
    }

    public void clickOnComponents() {
        clickOnElement(componentLink);
    }

    public void clickOnCurrancy() {
        clickOnElement(currancyDropDown);
        Reporter.log("Select currancy" + currancyDropDown + "from ram dropdown " + currancyDropDown.toString() + "<br>");
    }
public void mouseHoverOnPoundCurrancy (){
        mouseHoverToElement(poundLink);
    Reporter.log("Select pound" + poundLink + "from ram dropdown " + poundLink.toString() + "<br>");
}

    public void clickOnMyAccount() {
        clickOnElement(myAccountLink);
    }

}


