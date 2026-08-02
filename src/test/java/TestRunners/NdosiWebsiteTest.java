package TestRunners;


import extentReport.ExtentReportManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Testdata.ReadFromDatabase;
import utils_Nosipho.Base;

@Listeners(ExtentReportManager.class)
public  class NdosiWebsiteTest extends Base {

    @BeforeClass
    public void setup(){
        ReadFromDatabase.dbConnection();
    }

    @Test(priority = 1)
    public  void testHomePageNdosiWebsite(){

        homePage.verifyHomeScreen();
    }

    @Test(priority = 2)
    public  void testLoginPageNdosiWebsite(){
        homePage.clickLoginButton();
        loginPage.enterUsername(ReadFromDatabase.getUsername);
        loginPage.enterPassword(ReadFromDatabase.getPassword);
      loginPage.LoginButton();

    }
    @Test(dependsOnMethods = "testLoginPageNdosiWebsite")
    public  void verifyDashboardPage(){

        dashboardPage.verifyDashboard();
    }

    @AfterClass
    public void closeBrowser(){

        driver.quit();
    }



}
