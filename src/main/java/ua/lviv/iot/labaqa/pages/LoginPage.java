package ua.lviv.iot.labaqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.lviv.iot.labaqa.locators.LoginLocator;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPurchaseAsGuest() {
        return findElement(LoginLocator.CONTINUE_AS_GUEST);
    }
    public WebElement getLoginAsGuest() {
        return findElement(LoginLocator.LOGIN_AS_GUEST);
    }

    public void clickPurchaseAsGuest() {
        click(getPurchaseAsGuest());
    }

    public void waitForLoginAsGuest() {
        waitForVisible(LoginLocator.LOGIN_AS_GUEST);
    }

    public void clickLoginAsGuest() {
        click(getLoginAsGuest());
    }

    public void waitForElementsLoaded() {
        waitForVisible(LoginLocator.CONTINUE_AS_GUEST);
    }
}
