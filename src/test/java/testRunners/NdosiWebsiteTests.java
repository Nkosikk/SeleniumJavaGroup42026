package testRunners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Base;

public class NdosiWebsiteTests extends Base {


    @Test(priority = 1)
    public void verifyHomeContentTest(){
        homePage.verifyHomeScreenContent();
    }


    @Test(priority = 2)
    public void submitLoginDetailsTest(){
        homePage.clickMainLoginButton();
        loginPage.enterUsername("buyi+dev@gmail.com");
        loginPage.enterPassword("@12345678");
        loginPage.loginButton();


    }

    @Test(dependsOnMethods = "submitLoginDetailsTest")
    public void verifyLoginFlowIsSuccessfulTest() throws InterruptedException {
        dashboardPage.verifyDashboardContent();
    }

    @AfterTest
  public void closeBrowser(){
       driver.quit();
    }
    }








