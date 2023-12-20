package ua.lviv.iot.labaqa.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ua.lviv.iot.labaqa.locators.Locator;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement findElement(Locator locator) {
        return driver.findElement(By.xpath(locator.getValue()));
    }

    protected void click(WebElement element) {
        element.click();
    }

    protected void click(Locator locator) {
        click(findElement(locator));
    }

    protected void enterText(WebElement element, String text) {
        element.sendKeys(text);
    }

    protected void enterText(Locator locator, String text) {
        enterText(findElement(locator), text);
    }

    protected void waitForVisible(Locator locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator.getValue())));
    }

    protected void waitForClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void waitForClickable(Locator locator) {
        waitForClickable(findElement(locator));
    }

    protected void moveTo(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
        waitForClickable(element);
    }

    protected void moveTo(Locator locator) {
        moveTo(findElement(locator));
    }
}
