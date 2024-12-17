package index.php.demo.com.tutorialsninja.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LaptopsAndNotebooksPage extends index.php.demo.com.tutorialsninja.utility.Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Laptops & Notebooks']")
    WebElement verifyLaptopAndNotebooksText;

    @CacheLookup
    @FindBy(id= "input-sort")
    WebElement sortDropDown ;

    @CacheLookup
    @FindBy(xpath= "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[1]/h4[1]/a[1]")
    WebElement clickOnMacBook;

    @CacheLookup
    @FindBy(id= "//h1[contains(text(),'MacBook')]")
    WebElement macbookText ;

    public String verifyLaptopAndNotebooksText (){
       String message = getTextFromElement(verifyLaptopAndNotebooksText);
       return message;
    }
    public void selectSortByPriceHighTOlow(String type){
        selectByVisibleTextFromDropDown(sortDropDown, "Price (High > Low)");
        Reporter.log("Clicking on High to low" +  sortDropDown.toString());
    }

    public void setClickOnMacBook (){
        clickOnElement(clickOnMacBook);
    }

    public String verifyMacbook (){
        String message = getTextFromElement(macbookText);
        return message;
    }
}
