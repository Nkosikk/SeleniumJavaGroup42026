package testRunners;

import extentReport.ExtentReportManager;
import org.testng.annotations.*;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;
import utils.Base;
import org.testng.annotations.AfterClass;

@Listeners(ExtentReportManager.class)
public class NdosiWebsiteTests extends Base {

    @Test(priority = 1)
    public void verifyHomeContent() {

        HomePage homePage = new HomePage(Base.driver);
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


