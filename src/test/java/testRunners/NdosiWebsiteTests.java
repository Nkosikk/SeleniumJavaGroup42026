package testRunners;

import extentReport.extentReportManager;
import org.testng.annotations.*;
import pages.HomePage;
import utils.Base;
import org.testng.annotations.AfterClass;

@Listeners(extentReportManager.class)
public class NdosiWebsiteTests extends Base {

    @Test(priority = 1)
    public void verifyHomeContent() {
        homePage.verifyHomeScreenContent();

    }

    @Test(priority = 2)
    public void verifyLoginPage() {
        homePage.clickMainLoginButton();
        loginPage.enterUsername("mashabela96@gmail.com");
        loginPage.enterPassword("Test@1234");
        loginPage.loginButton();
    }

    @Test(dependsOnMethods = {"verifyLoginPage"}, priority = 3)
    public void verifyLoginFlowIsSuccessfulTest() {
        dashboardPage.verifyDashboardContent();
    }
        @AfterClass
        public void closeBrowser(){
            driver.quit();
        }
    }


