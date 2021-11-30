package ua.lviv.iot.labaqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.lviv.iot.labaqa.locators.PaymentLocator;

public class PaymentPage extends BasePage {

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailField() {
        return findElement(PaymentLocator.EMAIL_FIELD);
    }

    public WebElement getEmailContainer() {
        return findElement(PaymentLocator.EMAIL_CONTAINER);
    }

    public WebElement getPaymentMethodContainer() {
        return findElement(PaymentLocator.PAYMENT_METHOD_CONTAINER);
    }

    public WebElement getCreditCardPaymentChoice() {
        return findElement(PaymentLocator.CREDIT_CARD_PAYMENT_CHOICE);
    }

    public WebElement getAgreeToConditionsContainer() {
        return findElement(PaymentLocator.AGREE_TO_CONDITIONS_CONTAINER);
    }

    public WebElement getAgreeToConditionsCheckbox() {
        return findElement(PaymentLocator.AGREE_TO_CONDITIONS_CHECKBOX);
    }

    public WebElement getPurchaseButton() {
        return findElement(PaymentLocator.PURCHASE_BUTTON);
    }

    public void enterEmail(String email) {
        enterText(getEmailField(), email);
    }

    public void moveToEmail() {
        moveTo(getEmailContainer());
    }

    public void moveToPaymentOptions() {
        moveTo(getPaymentMethodContainer());
    }

    public void selectCreditCardPayment() {
        click(getCreditCardPaymentChoice());
    }

    public void moveToAgreeToConditions() {
        moveTo(getAgreeToConditionsContainer());
    }

    public void selectAgreeToConditions() {
        click(getAgreeToConditionsCheckbox());
    }

    public void clickPurchaseButton() {
        click(getPurchaseButton());
    }

    public void waitForElementsLoaded() {
        waitForVisible(PaymentLocator.EMAIL_FIELD);
    }
}
