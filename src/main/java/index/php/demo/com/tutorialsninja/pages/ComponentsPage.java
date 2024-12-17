package index.php.demo.com.tutorialsninja.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComponentsPage extends index.php.demo.com.tutorialsninja.utility.Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Components']")
    WebElement componentsText ;


    public String componentText (){
        getTextFromElement(componentsText);
        String message = getTextFromElement(componentsText);
        return message;

    }
}
