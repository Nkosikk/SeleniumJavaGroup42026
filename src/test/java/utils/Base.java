package utils;

import org.openqa.selenium.WebDriver;

public class Base {

  static final BrowserFactory factory = new BrowserFactory();

  public  static final WebDriver driver = factory.launchBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/#overview");






}
