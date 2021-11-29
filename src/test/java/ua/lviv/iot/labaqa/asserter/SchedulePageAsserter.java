package ua.lviv.iot.labaqa.asserter;

import org.openqa.selenium.WebDriver;
import ua.lviv.iot.labaqa.locators.ScheduleLocator;

public class SchedulePageAsserter extends BaseAsserter {

    public static void assertFromFieldContains(String text, WebDriver driver) {
        assertFieldContains(findElement(driver, ScheduleLocator.FROM_FIELD), text);
    }

    public static void assertToFieldContains(String text, WebDriver driver) {
        assertFieldContains(findElement(driver, ScheduleLocator.TO_FIELD), text);
    }

}
