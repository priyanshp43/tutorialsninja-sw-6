package index.php.demo.com.tutorialsninja.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductPage extends index.php.demo.com.tutorialsninja.utility.Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement changeqty;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement clickaddToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='checkout-cart']/div[1]")
    WebElement verifySuccess;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
    WebElement clickOnShoppingCart;


    public void setChangeqty(String qty) {
        sendTextToElement(changeqty, qty);
        Reporter.log("enter qty" + changeqty + "in qty field " + changeqty.toString() + "<br>");

    }

    public void clickOnAddToCart() {
        clickOnElement(clickaddToCart);
        Reporter.log("click on Add to Cart" + clickaddToCart + " on product page " + clickaddToCart.toString() + "<br>");
    }

    public void veridySuccessText() {
        String message = getTextFromElement(verifySuccess);
        Reporter.log("click on Add to Cart" + clickaddToCart + " on product page " + clickaddToCart.toString() + "<br>");
    }

    public void setClickOnShoppingCart() {
        clickOnElement(clickOnShoppingCart);
        Reporter.log("click on Add to Cart" + clickOnShoppingCart + " on product page " + clickOnShoppingCart.toString() + "<br>");
    }

    public String shoppingcarttext() {
        String message = getTextFromElement(clickOnShoppingCart);
        Reporter.log("click on Add to Cart" + clickOnShoppingCart + " on product page " + clickOnShoppingCart.toString() + "<br>");
        return message;
    }


}
