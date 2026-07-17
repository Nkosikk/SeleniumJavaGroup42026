package testRunners;

import org.testng.annotations.Test;
import pages.homePage;

public class ndosiWebsiteTests extends utils.base {

    @Test
    public void verifyHomeContentTest() {
        homePage.verifyHomeScreenContent();
    }
}
