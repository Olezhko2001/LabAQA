package ua.lviv.iot.labaqa.asserter;

import org.openqa.selenium.WebDriver;
import ua.lviv.iot.labaqa.locators.TravelDataLocator;

public class TravelDataPageAsserter extends BaseAsserter {

    public static void assertNameFieldContains(String text, WebDriver driver) {
        assertFieldContains(findElement(driver, TravelDataLocator.FIRST_NAME_INPUT), text);
    }

    public static void assertSurnameFieldContains(String text, WebDriver driver) {
        assertFieldContains(findElement(driver, TravelDataLocator.SURNAME_INPUT), text);
    }

    public static void assertBirthdayFieldContains(String text, WebDriver driver) {
        assertFieldContains(findElement(driver, TravelDataLocator.BIRTHDAY_INPUT), text);
    }

    public static void assertNoDiscountSelected(WebDriver driver) {
        assertElementContains(findElement(driver, TravelDataLocator.SELECTED_DISCOUNT), "No discount");
    }

    public static void assertElementsVisible(WebDriver driver) {
        assertElementDisplayed(findElement(driver, TravelDataLocator.FIRST_NAME_INPUT));
    }

    public static void assertFirstClassSelected(WebDriver driver) {
        findElement(driver, TravelDataLocator.FIRST_CLASS_OPTION);
        assertElementChecked(findElement(driver, TravelDataLocator.FIRST_CLASS_OPTION));
    }
}
