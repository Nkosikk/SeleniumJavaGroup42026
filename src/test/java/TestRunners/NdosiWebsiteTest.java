package TestRunners;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utils_Nosipho.Base;

public  class NdosiWebsiteTest extends Base {

    @Test(priority = 1)
    public  void testHomePageNdosiWebsite(){
        homePage.verifyHomeScreen();
    }
    @Test(priority = 2)
    public  void testLoginPageNdosiWebsite(){
        homePage.clickLoginButton();
        loginPage.enterLoginDetails(driver);
        loginPage.ClickOnLoginButton();
        loginPage.verifyLoginPage();
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
