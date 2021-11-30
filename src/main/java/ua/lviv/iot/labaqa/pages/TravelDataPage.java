package ua.lviv.iot.labaqa.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public WebElement getFirstNameField() {
        return findElement(TravelDataLocator.FIRST_NAME_INPUT);
    }

    public WebElement getSurnameField() {
        return findElement(TravelDataLocator.SURNAME_INPUT);
    }

    public WebElement getBirthdayField() {
        return findElement(TravelDataLocator.BIRTHDAY_INPUT);
    }

    public WebElement getNoDiscountsCheckbox() {
        return findElement(TravelDataLocator.NO_DISCOUNTS_CHECKBOX);
    }

    public WebElement getTravelOptions() {
        return findElement(TravelDataLocator.TRAVEL_OPTIONS);
    }

    public WebElement getFirstClassToggle() {
        return findElement(TravelDataLocator.FIRST_CLASS_TOGGLE);
    }

    public WebElement getConfirmButton() {
        return findElement(TravelDataLocator.CONFIRM);
    }

    public WebElement getDiscountCardsDropdown() {
        return findElement(TravelDataLocator.DISCOUNT_CARDS_DROPDOWN);
    }

    public void setFirstName(String name) {
        enterText(getFirstNameField(), name);
    }

    public void setSurname(String surname) {
        enterText(getSurnameField(), surname);
    }

    public void setBirthday(String birthday) {
        enterText(getBirthdayField(), birthday);
    }

    public void setNoDiscount() {
        click(getNoDiscountsCheckbox());
    }

    public void waitForElementsLoaded() {
        waitForVisible(TravelDataLocator.FIRST_NAME_INPUT);
    }

    public void moveToTravelOptions() {
        moveTo(getTravelOptions());
    }

    public void selectFirstClass() {
        getFirstClassToggle();
        click(getFirstClassToggle());
    }

    public void submit() {
        fluentWaitToBeClickable(TravelDataLocator.CONFIRM);
    }

    public void selectSurnameField() {
        click(getSurnameField());
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
        waitForClickable(getDiscountCardsDropdown());
        fluentWaitToBeClickable(TravelDataLocator.DISCOUNT_CARDS_DROPDOWN);
        fluentWaitToBeClickable(TravelDataLocator.DISCOUNT_CARDS_DROPDOWN);
        fluentWaitToBeClickable(TravelDataLocator.DISCOUNT_CARDS_DROPDOWN);
    }
}
