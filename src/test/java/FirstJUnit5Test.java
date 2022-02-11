import base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;

public class FirstJUnit5Test extends TestBase {
// a comment to check polling scm in jenkins

    @Test
    void firstTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edgewordstraining.co.uk/webdriver2/");
        driver.findElement(By.linkText("Login To Restricted Area")).click();
        driver.quit();

    }

    @Test
    void secondTest() {
        // Test name: SellDEDemo
        // Step # | name | target | value
        // 1 | open | /webdriver2/ |
        driver.get("https://edgewordstraining.co.uk/webdriver2/");
        // 2 | setWindowSize | 974x1047 |
        driver.manage().window().setSize(new Dimension(974, 1047));
        // 3 | click | css=.last span |
        driver.findElement(By.cssSelector(".last span")).click();
        // 4 | click | linkText=Forms |
        driver.findElement(By.linkText("Forms")).click();
        // 5 | click | id=textInput |
        driver.findElement(By.id("textInput")).click();
        // 6 | type | id=textInput | steve powell
        driver.findElement(By.id("textInput")).sendKeys("steve powell");
        // 7 | click | id=textArea |
        driver.findElement(By.id("textArea")).click();
        // 8 | type | id=textArea | was\nhere
        driver.findElement(By.id("textArea")).sendKeys("was\nhere");
        // 9 | click | id=checkbox |
        driver.findElement(By.id("checkbox")).click();
        // 10 | click | id=select |
        driver.findElement(By.id("select")).click();
        // 11 | select | id=select | label=Selection Two
        {
            WebElement dropdown = driver.findElement(By.id("select"));
            dropdown.findElement(By.xpath("//option[. = 'Selection Two']")).click();
        }
        // 12 | click | id=two |
        driver.findElement(By.id("two")).click();
        // 13 | click | linkText=Submit |
        driver.findElement(By.linkText("Submit")).click();
        // 14 | click | css=.htmlTable tr:nth-child(2) |
        driver.findElement(By.cssSelector(".htmlTable tr:nth-child(2)")).click();
        // 15 | assertText | id=textInputValue | steve powell
        assertThat(driver.findElement(By.id("textInputValue")).getText(), is("steve powell"));
        // 16 | click | css=tr:nth-child(3) > td:nth-child(3) |
        driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(3)")).click();
        // 17 | verifyText | id=textAreaValue | was here
        try{
            assertThat(driver.findElement(By.id("textAreaValue")).getText(), is("was here"));
        } catch (AssertionError e) {
            verificationerrors.append(e.toString());
        }
        // 18 | click | linkText=Back to form |
        driver.findElement(By.linkText("Back to form")).click();
        // 19 | click | linkText=CSS/XPath |
        driver.findElement(By.linkText("CSS/XPath")).click();

        //Drag drop using actions
        WebElement element = driver.findElement(By.cssSelector(".ui-slider-handle"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).clickAndHold().moveByOffset(100,0).release();
        builder.perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        // 20 | mouseDownAt | css=.ui-slider-handle | 8.546875,7.453125
//        {
//            WebElement element = driver.findElement(By.cssSelector(".ui-slider-handle"));
//            Actions builder = new Actions(driver);
//            builder.moveToElement(element).clickAndHold().perform();
//        }
//        // 21 | mouseMoveAt | css=.ui-slider-handle | 8.546875,7.453125
//        {
//            WebElement element = driver.findElement(By.cssSelector(".ui-slider-handle"));
//            Actions builder = new Actions(driver);
//            builder.moveToElement(element).perform();
//        }
//        // 22 | mouseUpAt | css=.ui-slider-handle | 8.546875,7.453125
//        {
//            WebElement element = driver.findElement(By.cssSelector(".ui-slider-handle"));
//            Actions builder = new Actions(driver);
//            builder.moveToElement(element).release().perform();
//        }
        // 23 | click | css=.ui-slider-handle |
        driver.findElement(By.cssSelector(".ui-slider-handle")).click();
        // 24 | click | id=apple |
        driver.findElement(By.id("apple")).click();
        // 25 | click | linkText=Home |
        driver.findElement(By.linkText("Home")).click();
    }
}
