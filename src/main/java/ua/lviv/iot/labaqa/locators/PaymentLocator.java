package ua.lviv.iot.labaqa.locators;

public enum PaymentLocator implements Locator {
    EMAIL_FIELD("//*[@id='shopForm_kaeuferinformationen_newEmailInput_valueComp']"),
    EMAIL_CONTAINER("//*[@id='shopForm_zahlungcontent']/fieldset[1]"),
    CREDIT_CARD_PAYMENT_CHOICE("//*[@id='panel_new_0']"),
    PAYMENT_METHOD_CONTAINER("//*[@id='shopForm_zmDetailsContainer']"),
    AGREE_TO_CONDITIONS_CONTAINER("//*[@id='shopForm_zahlungcontent']/fieldset[3]"),
    AGREE_TO_CONDITIONS_CHECKBOX("//*[@id='shopForm_agbCheckbox_valueComp']"),
    PURCHASE_BUTTON("//*[@id='kaufenButtonEnabled']"),
    ERRORS("//*[@id='shopForm_errors_list']/li");

    private final String value;

    PaymentLocator(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
