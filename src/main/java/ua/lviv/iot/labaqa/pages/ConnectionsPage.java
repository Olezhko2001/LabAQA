package ua.lviv.iot.labaqa.pages;

import org.openqa.selenium.*;
import ua.lviv.iot.labaqa.locators.ConnectionsLocator;

public class ConnectionsPage extends BasePage {

    public ConnectionsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFirstConnection() {
        WebElement shadowHost = findElement(ConnectionsLocator.FIRST_CONNECTION_SHADOW_HOST);
        SearchContext shadowRoot = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowHost);
        return shadowRoot.findElement(By.cssSelector(ConnectionsLocator.CONNECTION_INSIDE_SHADOW_ROOT_CSS_SELECTOR.getValue()));
    }

    public WebElement getSecondConnection() {
        WebElement shadowHost = findElement(ConnectionsLocator.SECOND_CONNECTION_SHADOW_HOST);
        SearchContext shadowRoot = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowHost);
        return shadowRoot.findElement(By.cssSelector(ConnectionsLocator.CONNECTION_INSIDE_SHADOW_ROOT_CSS_SELECTOR.getValue()));
    }

    public WebElement getBuySecondTicket() {
        return findElement(ConnectionsLocator.BUY_SECOND_TICKET);
    }

    public void clickSecondConnection() {
        waitForClickable(getSecondConnection());
        click(getSecondConnection());
    }

    public void moveToFirstConnection() {
        waitForVisible(ConnectionsLocator.FIRST_CONNECTION_SHADOW_HOST);
        moveTo(getFirstConnection());
    }

    public void buySecondTicket() {
        waitForVisible(ConnectionsLocator.BUY_SECOND_TICKET);
        waitForClickable(ConnectionsLocator.BUY_SECOND_TICKET);
        click(getBuySecondTicket());
    }

    public void waitForBuyButton() {
        waitForVisible(ConnectionsLocator.BUY_SECOND_TICKET);
        waitForClickable(getBuySecondTicket());
    }
}
