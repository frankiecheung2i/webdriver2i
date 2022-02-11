import base.TestBase;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import poms.HomePOM;
import poms.LoginPOM;

public class LoginUsingPom extends TestBase {

    @DisplayName("Reads from a CSV using JUnit 5")
    @ParameterizedTest(name = "{displayName}{index} => username={0}, password={1}")
    @CsvFileSource(files = "test-data.csv", useHeadersInDisplayName = true)
    void login(String username, String password) throws InterruptedException {
        driver.get("https://www.edgewordstraining.co.uk/webdriver2/");
        HomePOM homepage = new HomePOM(driver);
        homepage.goLogin();

        LoginPOM loginpage = new LoginPOM(driver);
        Assert.assertTrue(loginpage.LoginExpectSuccess(username, password));

        Thread.sleep(3000);
    }
}
