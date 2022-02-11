import base.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ExerciseTest extends TestBase {


    @Test
    void checkHeader() {
        driver.get("https://2itesting.com/");
        //driver.findElement(By.cssSelector(".remove-cookie-message.btn-info.btn-sm.pull-right")).click();
        driver.findElement(By.className("remove-cookie-message")).click();
        driver.findElement(By.linkText("TEST CONSULTANCY")).click();
        assertThat(driver.findElement(By.tagName("h1")).getText(), is("Test Consultancy"));
    }
}
