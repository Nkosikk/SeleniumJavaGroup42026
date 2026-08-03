package testRunners;

import extentReport.ExtentReportManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import testData.ReadFromDatabase;
import utils.Base;
@Listeners(ExtentReportManager.class)
public class NdosiWebsiteTest extends Base {


    @BeforeClass
    public void setup(){
        ReadFromDatabase.dbConnection();
    }

    @Test(priority = 1)
    public void verifyHomeContentTest(){
        homepage.verifyHomeScreenContent();
    }

    @Test(priority = 2)
    public void submitLoginDetailsTest(){
        homepage.clickMainLoginButton();
        loginPage.enterUsername(ReadFromDatabase.getUsername);
        loginPage.enterPassword(ReadFromDatabase.getPassword);
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = {"submitLoginDetailsTest"})
    public void verifyLoginFlowIsSuccessfulTest(){
        dashboardPage.verifyDashboardContent();
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit(); //close all tabs
    }
}
