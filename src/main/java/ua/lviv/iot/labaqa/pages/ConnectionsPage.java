package ua.lviv.iot.labaqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.lviv.iot.labaqa.locators.ConnectionsLocator;

public class ConnectionsPage extends BasePage {

    public ConnectionsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getConnectionsHeader() {
        return findElement(ConnectionsLocator.CONNECTIONS_HEADER);
    }

    public WebElement getOriginLocation() {
        return findElement(ConnectionsLocator.ORIGIN_LOCATION);
    }

    public WebElement getDestinationLocation() {
        return findElement(ConnectionsLocator.DESTINATION_LOCATION);
    }

    public WebElement getFirstConnection() {
        return findElement(ConnectionsLocator.FIRST_CONNECTION);
    }

    public WebElement getSecondConnection() {
        return findElement(ConnectionsLocator.SECOND_CONNECTION);
    }

    public WebElement getBuySecondTicket() {
        return findElement(ConnectionsLocator.BUY_SECOND_TICKET);
    }

    public void clickSecondConnection() {
        click(getSecondConnection());
    }

    public void moveToFirstConnection() {
        moveTo(getFirstConnection());
    }

    public void buySecondTicket() {
        click(getBuySecondTicket());
    }
}
