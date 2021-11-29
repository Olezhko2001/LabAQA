package ua.lviv.iot.labaqa.pages;

import org.openqa.selenium.WebDriver;
import ua.lviv.iot.labaqa.locators.LoginLocator;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickPurchaseAsGuest() {
        click(LoginLocator.PURCHASE_AS_GUEST);
    }

    public void waitForElementsLoaded() {
        waitForVisible(LoginLocator.PURCHASE_AS_GUEST);
    }
}
