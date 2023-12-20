package ua.lviv.iot.labaqa.locators;

public enum TravelDataLocator implements Locator {

    EMAIL_INPUT("//*[@id='passengerLightboxContent2_passengerForm_newEmailInput_valueComp']"),
    FIRST_NAME_INPUT("//*[@id='passengerLightboxContent2_passengerForm_reisende_0_vorname_valueComp']"),
    SURNAME_INPUT("//*[@id='passengerLightboxContent2_passengerForm_reisende_0_name_valueComp']"),
    BIRTHDAY_INPUT("//*[@id='passengerLightboxContent2_passengerForm_reisende_0_geburtsDatum_valueComp']"),
    DISCOUNT_CARDS_DROPDOWN("//*[@id='passengerLightboxContent2_passengerForm_reisende_0_abonnement_button']/span[2]"),
    NO_DISCOUNTS_CHECKBOX("//*[@id='passengerLightboxContent2_passengerForm_reisende_0_abonnement_KEINE']"),
    SELECTED_DISCOUNT("//*[@class='mod_multiselect_selection is_active']"),
    FIRST_CLASS_OPTION("//*[@id='shopForm_reiseoptionen_klasse1']"),
    CONFIRM("//*[@id='buttonAcceptPassenger']"),
    PROCEED_TO_PAYMENT("//*[@id='kaufenButtonEnabled']");

    private final String value;

    TravelDataLocator(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
