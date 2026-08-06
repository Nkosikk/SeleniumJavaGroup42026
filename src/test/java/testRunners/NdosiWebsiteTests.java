package testRunners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testData.ReadFromDataBase;
import utils.Base;

import java.time.Duration;

public class NdosiWebsiteTests extends Base {

    @BeforeTest
    public void setup(){
        ReadFromDataBase.dbConnection();
    }
    @Test

    public void verifyHomeContentTest() {
     homePage.verifyHomeScreenContent();
    }

    @Test(priority = 1)
    public void submitLoginScreenTest(){
        homePage.clickMainLoginButton();
        loginPage.enterEmail(ReadFromDataBase.getUsername);
        loginPage.enterPassword(ReadFromDataBase.getPassword);
        loginPage.selectLogin();
    }

    @Test(dependsOnMethods = "submitLoginScreenTest")
    public void closeBrowser(){
        driver.quit();
    }
}
