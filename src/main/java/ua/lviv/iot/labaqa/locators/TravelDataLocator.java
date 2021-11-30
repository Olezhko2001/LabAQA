package ua.lviv.iot.labaqa.locators;

public enum TravelDataLocator implements Locator {

    FIRST_NAME_INPUT("//*[@id='shopForm_reisende_0_vorname_valueComp']"),
    SURNAME_INPUT("//*[@id='shopForm_reisende_0_name_valueComp']"),
    BIRTHDAY_INPUT("//*[@id='shopForm_reisende_0_geburtsDatum_valueComp']"),
    DISCOUNT_CARDS_DROPDOWN("//*[@id='shopForm_reisende_0_abonnement_button']/span[2]"),
    NO_DISCOUNTS_CHECKBOX("//*[@id='shopForm_reisende_0_abonnement_KEINE']"),
    SELECTED_DISCOUNT("//*[@class='mod_multiselect_selection is_active']"),
    TRAVEL_OPTIONS("//*[@class='mod_fieldset var_shop']"),
    FIRST_CLASS_TOGGLE("//*[@for='shopForm_reiseoptionen_klasse1']"),
    FIRST_CLASS_OPTION("//*[@id='shopForm_reiseoptionen_klasse1']"),
    CONFIRM("//*[@id='kaufenButtonEnabled']");

    private final String value;

    TravelDataLocator(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
