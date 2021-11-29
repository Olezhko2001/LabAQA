package ua.lviv.iot.labaqa.asserter;

import org.openqa.selenium.WebDriver;
import ua.lviv.iot.labaqa.locators.ConnectionsLocator;

public class ConnectionsPageAsserter extends BaseAsserter {

    public static void assertConnectionsOpened(WebDriver driver) {
        assertElementDisplayed(findElement(driver, ConnectionsLocator.CONNECTIONS_HEADER));
    }

    public static void assertPurchaseTicketAvailable(WebDriver driver) {
        assertElementDisplayed(findElement(driver, ConnectionsLocator.BUY_SECOND_TICKET));
    }

    public static void assertOriginContains(String text, WebDriver driver) {
        String originString = "from\n" + text + " ";
        assertElementContains(findElement(driver, ConnectionsLocator.ORIGIN_LOCATION), originString);
    }

    public static void assertDestinationContains(String text, WebDriver driver) {
        String destinationString = "to\n" + text;
        assertElementContains(findElement(driver, ConnectionsLocator.DESTINATION_LOCATION), destinationString);
    }
}
