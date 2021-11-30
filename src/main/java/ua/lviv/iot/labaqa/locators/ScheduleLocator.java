package ua.lviv.iot.labaqa.locators;

public enum ScheduleLocator implements Locator {
    FROM_FIELD("//*[@id='fromField']"),
    TO_FIELD("//*[@id='toField']"),
    SEARCH("//*[@class='text__primarybutton button']");

    private final String value;

    ScheduleLocator(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
