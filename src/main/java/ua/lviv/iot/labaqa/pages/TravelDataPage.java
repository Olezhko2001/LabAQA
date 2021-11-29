package ua.lviv.iot.labaqa.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import ua.lviv.iot.labaqa.locators.Locator;
import ua.lviv.iot.labaqa.locators.TravelDataLocator;

import java.time.Duration;
import java.util.function.Function;

public class TravelDataPage extends BasePage {

    public TravelDataPage(WebDriver driver) {
        super(driver);
    }

    public void setFirstName(String name) {
        enterText(TravelDataLocator.FIRST_NAME_INPUT, name);
    }

    public void setSurname(String surname) {
        enterText(TravelDataLocator.SURNAME_INPUT, surname);
    }

    public void setBirthday(String birthday) {
        enterText(TravelDataLocator.BIRTHDAY_INPUT, birthday);
    }

    public void setNoDiscount() {
        click(TravelDataLocator.NO_DISCOUNTS_CHECKBOX);
    }

    public void waitForElementsLoaded() {
        waitForVisible(TravelDataLocator.FIRST_NAME_INPUT);
    }

    public void moveToTravelOptions() {
        moveTo(TravelDataLocator.TRAVEL_OPTIONS);
    }

    public void selectFirstClass() {
        click(TravelDataLocator.FIRST_CLASS_TOGGLE);
    }

    public void submit() {
        fluentWaitToBeClickable(TravelDataLocator.CONFIRM);
    }

    public void selectSurnameField() {
        click(TravelDataLocator.SURNAME_INPUT);
    }

    public void fluentWaitToBeClickable(Locator locator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(StaleElementReferenceException.class);
        wait.until((Function<WebDriver, Object>) webDriver -> {
            waitForClickable(locator);
            click(locator);
            return findElement(locator);
        });
    }

    public void openDiscountsDropdown() {
        waitForClickable(TravelDataLocator.DISCOUNT_CARDS_DROPDOWN);
        fluentWaitToBeClickable(TravelDataLocator.DISCOUNT_CARDS_DROPDOWN);
        fluentWaitToBeClickable(TravelDataLocator.DISCOUNT_CARDS_DROPDOWN);
        fluentWaitToBeClickable(TravelDataLocator.DISCOUNT_CARDS_DROPDOWN);
    }
}
