package ua.lviv.iot.labaqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\webdrivers\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Program Files\\webdrivers\\msedgedriver.exe");
    }

    public static WebDriver getDriver(Browser browser) {
        switch (browser) {
            case CHROME:
                return new ChromeDriver();
            case EDGE:
                return new EdgeDriver();
        }
        throw new IllegalArgumentException("No web driver available for " + browser);
    }
}
