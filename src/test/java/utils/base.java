package utils;

import org.openqa.selenium.WebDriver;

public class base {


    static final browserFactory factory = new browserFactory();

    public static final WebDriver driver = browserFactory.launchBrowser("chrome","https://ndosisimplifiedautomation.vercel.app/#overview");

}
