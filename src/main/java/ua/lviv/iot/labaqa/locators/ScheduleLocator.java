package ua.lviv.iot.labaqa.locators;

public enum ScheduleLocator implements Locator {
    SHOW_PURPOSES_BUTTON("//*[@id='onetrust-pc-btn-handler']"),
    REFUSE_ALL_BUTTON("//*[@class='ot-pc-refuse-all-handler']"),
    FROM_FIELD("//*[@id='From0']"),
    TO_FIELD("//*[@id='To1']");

    private final String value;

    ScheduleLocator(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
