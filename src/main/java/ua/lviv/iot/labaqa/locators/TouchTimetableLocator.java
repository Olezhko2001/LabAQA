package ua.lviv.iot.labaqa.locators;

public enum TouchTimetableLocator implements Locator {

    TIMETABLE_BOXES("//*[@class='mod_timetable_touch_boxes']"),
    ZURICH_LOCATION_BOX("//*[@data-touch-station-id='8503000']"),
    GENEVE_LOCATION_BOX("//*[@data-touch-station-id='8501008']");

    private final String value;

    TouchTimetableLocator(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
