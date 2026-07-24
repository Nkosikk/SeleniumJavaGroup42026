package testRunners;

import org.testng.annotations.Test;
import utils.Base;

public class TestCases extends Base {

    // HOMEPAGE TESTS

    @Test
    public void verifyHomeContentTest() {

        homePage.verifiesLandingPageContent();
    }
    @Test(dependsOnMethods = "verifyHomeContentTest")
    public void clickLoginButton() {
        homePage.MainLoginButtonLogin();
    }


    // LOGIN PAGE TESTS

    @Test(dependsOnMethods = "clickLoginButton")
    public void EnterEmail(){

        loginPage.enterEmail("segwe.bz@gmail.com");
    }

    @Test(dependsOnMethods = "EnterEmail")
    public  void EnterPassword(){

        loginPage.enterPassword("rA!ny@$14");
    }

    @Test(dependsOnMethods = "EnterPassword")
    public void ClickLogin(){
        loginPage.clickSubmit();
    }

    // DASHBOARD TESTS

    @Test(dependsOnMethods = "ClickLogin")
    public void VerifyDashboardElement(){
        dashboardPage.verifyLoggedIn();
    }
    @Test(dependsOnMethods = "VerifyDashboardElement")
    public void ClickLearnDropdown(){
        dashboardPage.clickLearnDropdown();
    }
    @Test(dependsOnMethods = "ClickLearnDropdown")
    public  void ClickLearningMaterial(){
        dashboardPage.pickLearningMaterial();
    }

}