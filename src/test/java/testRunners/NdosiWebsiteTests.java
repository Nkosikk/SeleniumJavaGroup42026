package testRunners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testData.ReadFromDatabase;
import utils.Base;

public class NdosiWebsiteTests extends Base {


    @BeforeClass
    public void setup(){
        ReadFromDatabase.dbConnection();
    }
    @Test(priority = 1)
    public void verifyHomeContentTest(){
        homePage.verifyHomeScreenContent();
    }

    @Test(priority = 2)
    public void submitLoginDetailsTest(){
        homePage.clickMainLoginButton();
        loginPage.enterUsername(ReadFromDatabase.getUsername);
        loginPage.enterPassword(ReadFromDatabase.getPassword);
        loginPage.loginButton();
    }

    @Test(dependsOnMethods = "submitLoginDetailsTest")
    public void verifyLoginFlowIsSuccessfulTest() {
        dashboardPage.verifyDashboardContent();
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

}
