package testRunners;

import org.testng.annotations.Test;
import utils.Base;


public class NdosiWebsiteTests extends Base {

    @Test
    public void verifyHomePageTest(){

        homePage.homepageVerifyContent();
        System.out.println("Test successful");

    }

    @Test(dependsOnMethods = "verifyHomePageTest")
    public void NavigateToLoginPageTest() {

        homePage.clickMainLoginButton();
        System.out.println("Test successful, Navigated to login page");


    }

    @Test(dependsOnMethods = "NavigateToLoginPageTest")
    public void verifyLoginPageTest(){
        loginPage.verifyLoginPage();
    }

    @Test(dependsOnMethods ="verifyLoginPageTest" )
    public void inputCredentialAndVerifyLoggedIn()  {
        loginPage.inputLoginEmail("demonslayer@gmail.com");
        loginPage.inputLoginPassword("Hashira@2026");
        loginPage.clickLoginButton();

        dashboardPage.verifyDashBoardPageContent();
        System.out.println("Test successful");

    }


}

