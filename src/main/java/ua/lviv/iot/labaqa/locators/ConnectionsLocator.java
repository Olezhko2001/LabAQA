package ua.lviv.iot.labaqa.locators;

public enum ConnectionsLocator implements Locator {

    CONNECTIONS_HEADER("//*[@id='shopForm_timetablePageheader']"),
    ORIGIN_LOCATION("//*[@class='mod_pagetitle_origin_destination']"),
    DESTINATION_LOCATION("//*[@class='mod_pagetitle_target_destination']"),
    FIRST_CONNECTION_SHADOW_HOST("//*[@id='main']/section/div[1]/div[1]/div/section/span/div/div/div/div/ul/li[1]/sbb-timetable-row"),
    SECOND_CONNECTION_SHADOW_HOST("//*[@id='main']/section/div[1]/div[1]/div/section/span/div/div/div/div/ul/li[2]/sbb-timetable-row"),
    CONNECTION_INSIDE_SHADOW_ROOT_CSS_SELECTOR("sbb-card"),
    BUY_SECOND_TICKET("//*[@id='journey-summary']/sbb-journey-summary/div[2]/sbb-button[2]");

    private final String value;

    ConnectionsLocator(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
