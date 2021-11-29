package ua.lviv.iot.labaqa.asserter;

import org.openqa.selenium.WebDriver;
import ua.lviv.iot.labaqa.locators.LoginLocator;

public class LoginPageAsserter extends BaseAsserter {

    public static void assertPurchaseTicketAvailable(WebDriver driver) {
        assertElementDisplayed(findElement(driver, LoginLocator.PURCHASE_AS_GUEST));
    }
}
