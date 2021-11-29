package ua.lviv.iot.labaqa.pages;

import org.openqa.selenium.WebDriver;
import ua.lviv.iot.labaqa.locators.PaymentLocator;

public class PaymentPage extends BasePage {

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        enterText(PaymentLocator.EMAIL_FIELD, email);
    }

    public void moveToEmail() {
        moveTo(PaymentLocator.EMAIL_CONTAINER);
    }

    public void moveToPaymentOptions() {
        moveTo(PaymentLocator.PAYMENT_METHOD_CONTAINER);
    }

    public void selectCreditCardPayment() {
        click(PaymentLocator.CREDIT_CARD_PAYMENT_CHOICE);
    }

    public void moveToAgreeToConditions() {
        moveTo(PaymentLocator.AGREE_TO_CONDITIONS_CONTAINER);
    }

    public void selectAgreeToConditions() {
        click(PaymentLocator.AGREE_TO_CONDITIONS_CHECKBOX);
    }

    public void clickPurchaseButton() {
        click(PaymentLocator.PURCHASE_BUTTON);
    }

    public void waitForElementsLoaded() {
        waitForVisible(PaymentLocator.EMAIL_FIELD);
    }
}
