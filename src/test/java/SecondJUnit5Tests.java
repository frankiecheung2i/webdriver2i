import base.TestBase;
import helpers.HelperLib;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import static helpers.HelperLib.*;

public class SecondJUnit5Tests extends TestBase {


    @Test
    void loginLogout() throws InterruptedException {
        driver.get("https://www.edgewordstraining.co.uk/webdriver2/");
        driver.findElement(By.linkText("Login To Restricted Area")).click();
        driver.findElement(By.id("username")).sendKeys("edgewords");
        driver.findElement(By.id("password")).sendKeys("edgewords123");
        driver.findElement(By.linkText("Submit")).click();
        driver.findElement(By.linkText("Log Out")).click();
        driver.switchTo().alert().accept();

        waitHelper(By.id("username"), 10, driver);

        driver.findElement(By.id("username")).sendKeys("finished");
    }
}
