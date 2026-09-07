package testRunners;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testData.ReadFromDatabase;
import utils.Base;


public class NdosiWebsiteTests extends Base {

    @BeforeClass
    public void dbSetup() {
        ReadFromDatabase.databaseConnect();
    }

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
        loginPage.inputLoginEmail(ReadFromDatabase.getUsername);
        loginPage.inputLoginPassword(ReadFromDatabase.getPassword);
        loginPage.clickLoginButton();

        dashboardPage.verifyDashBoardPageContent();
        System.out.println("Test successful");

    }


}

