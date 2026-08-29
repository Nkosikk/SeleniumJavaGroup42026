package testRunners;

import org.testng.annotations.Test;
import utils.Base;

public class NdosiTestings extends Base {

    @Test
    public void verifyHomeTest(){

        homePage.homepageVerifyContent();
        System.out.println("Homepage Verified");



    }

    @Test
    public void NavigateToLoginPageTest() throws InterruptedException {

        homePage.clickMainLoginButton();
        System.out.println("Navigated to login page");

    }

    @Test

    public void verifyLoginPageTest() throws InterruptedException {

        homePage.clickMainLoginButton();
        loginPage.verifyLoginPage();
    }

    @Test
    public void insertLoginCredentials() throws InterruptedException {
        homePage.clickMainLoginButton();
        loginPage.inputLoginEmail("demonslayer@gmail.com");
        loginPage.inputLoginPassword("Hashira@2026");
        loginPage.clickLoginButton();
    }

    @Test
    public void VerifyDashBoardPageTest() throws InterruptedException {

        homePage.clickMainLoginButton();
        loginPage.inputLoginEmail("demonslayer@gmail.com");
        loginPage.inputLoginPassword("Hashira@2026");
        loginPage.clickLoginButton();

        dashboardPage.verifyDashBoardPageContent();
        System.out.println("ALLS GOOD");
        Thread.sleep(2000);
    }

}
