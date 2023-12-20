package ua.lviv.iot.labaqa.locators;

public enum LoginLocator implements Locator {

    CONTINUE_AS_GUEST("//*[@id='kaufenButtonEnabled']"),
    LOGIN_AS_GUEST("//*[@id='loginAsGuestButton']");

    private final String value;

    LoginLocator(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
