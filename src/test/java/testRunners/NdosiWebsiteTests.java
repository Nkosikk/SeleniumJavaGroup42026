package testRunners;

import org.testng.annotations.Test;
import utils.Base;

public class NdosiWebsiteTests extends Base {

    @Test(priority = 1)
    public void verifyHomeContentTest(){
        homePage.verifyHomeScreenContent();
    }

    @Test(priority = 2)
    public void submitLoginDetailsTest(){
        homePage.clickMainLoginButton();
        loginPage.enterUsername("titi@gmail.com");
        loginPage.enterPassword("tlou@97LT");
        loginPage.loginButton();
    }

    @Test(dependsOnMethods = "submitLoginDetailsTest")
    public void verifyLoginFlowIsSuccessfulTest(){
        dashboardPage.verifyDashboardContent();
    }


}
