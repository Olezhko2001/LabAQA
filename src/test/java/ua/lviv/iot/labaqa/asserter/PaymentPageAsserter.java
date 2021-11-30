package ua.lviv.iot.labaqa.asserter;

import org.openqa.selenium.WebDriver;
import ua.lviv.iot.labaqa.locators.PaymentLocator;

public class PaymentPageAsserter extends BaseAsserter {

    public static void assertElementsVisible(WebDriver driver) {
        assertElementDisplayed(findElement(driver, PaymentLocator.EMAIL_FIELD));
    }

    public static void assertEmailFieldContains(String text, WebDriver driver) {
        assertFieldContains(findElement(driver, PaymentLocator.EMAIL_FIELD), text);
    }

    public static void assertCreditCardOptionSelected(WebDriver driver) {
        assertElementChecked(findElement(driver, PaymentLocator.CREDIT_CARD_PAYMENT_CHOICE));
    }

    public static void assertAgreedToConditions(WebDriver driver) {
        assertElementChecked(findElement(driver, PaymentLocator.AGREE_TO_CONDITIONS_CHECKBOX));
    }

    public static void assertNoErrorMessage(WebDriver driver) {
        assertElementIsNotPresent(driver, PaymentLocator.ERRORS);
    }
}
