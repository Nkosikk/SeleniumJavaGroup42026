package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;

public class TakeScreenshots {

    public static String getSnapShotBase64(WebDriver driver) {
        TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
        String base64Code = takeScreenshot.getScreenshotAs(OutputType.BASE64);

        return base64Code;
    }
}