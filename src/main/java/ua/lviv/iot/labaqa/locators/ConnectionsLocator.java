package ua.lviv.iot.labaqa.locators;

public enum ConnectionsLocator implements Locator {

    CONNECTIONS_HEADER("//*[@id='shopForm_timetablePageheader']"),
    ORIGIN_LOCATION("//*[@class='mod_pagetitle_origin_destination']"),
    DESTINATION_LOCATION("//*[@class='mod_pagetitle_target_destination']"),
    FIRST_CONNECTION("//*[@id='shopForm_aktuelleVerbindungen_0_verbindung']/div[1]"),
    SECOND_CONNECTION("//*[@id='shopForm_aktuelleVerbindungen_1_verbindung']/div[1]"),
    BUY_SECOND_TICKET("//*[@id='leistungOfferieren1']");

    private final String value;

    ConnectionsLocator(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
