package ua.lviv.iot.labaqa.locators;

public enum LoginLocator implements Locator {

    PURCHASE_AS_GUEST("//*[@class='text__secondarybutton']");

    private final String value;

    LoginLocator(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
