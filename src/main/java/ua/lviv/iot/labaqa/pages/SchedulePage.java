package ua.lviv.iot.labaqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.lviv.iot.labaqa.locators.ScheduleLocator;

public class SchedulePage extends BasePage {

    public SchedulePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFromField() {
        return findElement(ScheduleLocator.FROM_FIELD);
    }

    public WebElement getToField() {
        return findElement(ScheduleLocator.TO_FIELD);
    }

    public WebElement getSearchConnections() {
        return findElement(ScheduleLocator.SEARCH);
    }

    public void enterFromLocation(String text) {
        enterText(getFromField(), text);
    }

    public void enterToLocation(String text) {
        enterText(getToField(), text);
    }

    public void searchConnections() {
        click(getSearchConnections());
    }

    public void waitForSearchClickable() {
        waitForClickable(getSearchConnections());
    }
}
