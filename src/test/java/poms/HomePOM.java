package poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOM {
    //Field to work with webdriver instance
    WebDriver driver;
    //Constructor to accept driver from test, and run PageFactory
    public HomePOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Locators
    @FindBy(linkText = "Login To Restricted Area")
    private WebElement loginLink;

    //Service Methods
    public void goLogin() {
        loginLink.click();
    }
}
