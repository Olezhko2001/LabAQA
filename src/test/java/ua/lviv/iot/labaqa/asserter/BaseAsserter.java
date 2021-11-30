package ua.lviv.iot.labaqa.asserter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.lviv.iot.labaqa.locators.Locator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BaseAsserter {

    protected static void assertFieldContains(WebElement field, String text) {
        assertEquals(text, field.getAttribute("value"));
    }

    protected static WebElement findElement(WebDriver driver, Locator locator) {
        return driver.findElement(By.xpath(locator.getValue()));
    }

    protected static void assertElementDisplayed(WebElement element) {
        assertTrue(element.isDisplayed());
    }

    protected static void assertElementContains(WebElement element, String text) {
        assertEquals(text, element.getAttribute("innerText"));
    }

    protected static void assertElementChecked(WebElement element) {
        assertEquals("true", element.getAttribute("checked"));
    }

    protected static void assertElementIsNotPresent(WebDriver driver, Locator locator) {
        assertEquals(0, driver.findElements(By.xpath(locator.getValue())).size());
    }
}
