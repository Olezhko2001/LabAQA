package ua.lviv.iot.labaqa.pages;

import org.openqa.selenium.WebDriver;
import ua.lviv.iot.labaqa.locators.ConnectionsLocator;

public class ConnectionsPage extends BasePage {

    public ConnectionsPage(WebDriver driver) {
        super(driver);
    }

    public void clickSecondConnection() {
        click(ConnectionsLocator.SECOND_CONNECTION);
    }

    public void moveToFirstConnection() {
        moveTo(ConnectionsLocator.FIRST_CONNECTION);
    }

    public void buySecondTicket() {
        click(ConnectionsLocator.BUY_SECOND_TICKET);
    }
}
