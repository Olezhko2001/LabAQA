package ua.lviv.iot.labaqa;

import org.openqa.selenium.WebDriver;

public class DriverWrapper {

    private static WebDriver driver = null;

    public static WebDriver getDriver(Browser browser) {
        if (driver == null) {
            driver = DriverFactory.getDriver(browser);
        }
        return driver;
    }
}
