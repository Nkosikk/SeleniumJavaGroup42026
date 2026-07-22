package testRunners;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Base;

public class NdosiWebsiteTests extends Base {

    @Test
    public void verifyHomeContentTest() {
     homePage.verifyHomeScreenContent();
    }

    @Test(priority = 1)
    public void submitLoginScreenTest(){
        homePage.clickMainLoginButton();
        loginPage.enterEmail("ituselenium@ndosi.co.za");
        loginPage.enterPassword("@1234567#");
        loginPage.selectLogin();
    }

    @Test(dependsOnMethods = "submitLoginScreenTest")
    public void verifyLoginFlowSuccessfulTest(){
        dashBoardPage.verifyDashboardPage();
    }
}
