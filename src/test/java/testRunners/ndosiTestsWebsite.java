package testRunners;

import org.testng.annotations.Test;

public class ndosiTestsWebsite extends utils.base {

    @Test (priority = 1)
    public void verifyHomeContentTest() {
        homePage.verifyHomeScreenContent();
    }

    @Test(priority = 2)
    public void clickMainLoginButtonTest() {
        homePage.clickMainLoginButton();
        loginPage.enterUserName("Titi@gmail.com");
        loginPage.enterPassword("tlou@97LT");
        loginPage.clickSubmitButton();
    }

    @Test(priority = 3)
    public void verifyLoginFlowIsSuccessfulTest() {
        dashboardPage.verifyDashboardPageContent();
    }
}
