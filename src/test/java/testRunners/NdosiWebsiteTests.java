package testRunners;

import org.testng.annotations.Test;
import utils.Base;

public class NdosiWebsiteTests extends Base {

    @Test
    public void verifyHomeTest(){

        homePage.homepageVerifyContent();
        System.out.println("Homepage Verified");



    }

    @Test(dependsOnMethods = "verifyHomeTest")
    public void LoginTest() throws InterruptedException {

        homePage.clickMainLoginButton();
        System.out.println("Navigated to login page");

    }

    @Test(dependsOnMethods = "LoginTest")
    public void verifyLoginPageTest(){
        loginPage.verifyLoginPage();
    }

    @Test(dependsOnMethods ="verifyLoginPageTest" )
    public void insertLoginCredentials() throws InterruptedException {
        loginPage.inputLoginCredentials();
        loginPage.clickLoginButton();
    }


}

