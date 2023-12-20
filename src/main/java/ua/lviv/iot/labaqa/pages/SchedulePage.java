package ua.lviv.iot.labaqa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.lviv.iot.labaqa.locators.ScheduleLocator;

public class SchedulePage extends BasePage {

    public SchedulePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getShowPurposesButton() {
        return findElement(ScheduleLocator.SHOW_PURPOSES_BUTTON);
    }

    public WebElement getRefuseAllButton() {
        return findElement(ScheduleLocator.REFUSE_ALL_BUTTON);
    }

    public WebElement getFromField() {
        return findElement(ScheduleLocator.FROM_FIELD);
    }

    public WebElement getToField() {
        return findElement(ScheduleLocator.TO_FIELD);
    }

    public void waitForShowPurposesButton() {
        waitForVisible(ScheduleLocator.SHOW_PURPOSES_BUTTON);
    }

    public void clickShowPurposesButton() {
        click(getShowPurposesButton());
    }

    public void waitForRefuseAllButton() {
        waitForVisible(ScheduleLocator.REFUSE_ALL_BUTTON);
    }

    public void clickRefuseAllButton() {
        click(getRefuseAllButton());
    }

    public void enterFromLocation(String text) {
        enterText(getFromField(), text);
    }

    public void enterToLocation(String text) {
        enterText(getToField(), text);
        pressEnter(getToField());
    }

    public void pressEnter(WebElement field) {
        field.sendKeys(Keys.RETURN);
    }
}
