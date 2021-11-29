package ua.lviv.iot.labaqa.pages;

import org.openqa.selenium.WebDriver;
import ua.lviv.iot.labaqa.locators.ScheduleLocator;

public class SchedulePage extends BasePage {

    public SchedulePage(WebDriver driver) {
        super(driver);
    }

    public void enterFromLocation(String text) {
        enterText(ScheduleLocator.FROM_FIELD, text);
    }

    public void enterToLocation(String text) {
        enterText(ScheduleLocator.TO_FIELD, text);
    }

    public void searchConnections() {
        click(ScheduleLocator.SEARCH);
    }

    public void waitForSearchClickable() {
        waitForClickable(ScheduleLocator.SEARCH);
    }
}
