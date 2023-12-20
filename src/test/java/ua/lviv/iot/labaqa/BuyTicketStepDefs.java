package ua.lviv.iot.labaqa;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import ua.lviv.iot.labaqa.asserter.ConnectionsPageAsserter;
import ua.lviv.iot.labaqa.asserter.LoginPageAsserter;
import ua.lviv.iot.labaqa.asserter.PaymentPageAsserter;
import ua.lviv.iot.labaqa.asserter.SchedulePageAsserter;
import ua.lviv.iot.labaqa.asserter.TravelDataPageAsserter;
import ua.lviv.iot.labaqa.pages.ConnectionsPage;
import ua.lviv.iot.labaqa.pages.LoginPage;
import ua.lviv.iot.labaqa.pages.PaymentPage;
import ua.lviv.iot.labaqa.pages.SchedulePage;
import ua.lviv.iot.labaqa.pages.TravelDataPage;

public class BuyTicketStepDefs {

    private WebDriver driver;

    private SchedulePage schedulePage;
    private ConnectionsPage connectionsPage;
    private LoginPage loginPage;
    private TravelDataPage travelDataPage;
    private PaymentPage paymentPage;

    @Before
    public void setUp() {
        driver = DriverWrapper.getDriver(Browser.EDGE);
        schedulePage = new SchedulePage(driver);
        connectionsPage = new ConnectionsPage(driver);
        loginPage = new LoginPage(driver);
        travelDataPage = new TravelDataPage(driver);
        paymentPage = new PaymentPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("I am on SBB site")
    public void iAmOnSBBSite() {
        driver.get("https://sbb.ch/en");
    }

    @Then("I decline all cookies")
    public void iDeclineAllCookies() {
        schedulePage.waitForShowPurposesButton();
        schedulePage.clickShowPurposesButton();
        schedulePage.waitForRefuseAllButton();
        schedulePage.clickRefuseAllButton();
    }

    @When("I enter {string} as from location")
    public void iEnterAsFromLocation(String fromLocation) {
        schedulePage.enterFromLocation(fromLocation);
    }

    @Then("From field should contain {string}")
    public void fromFieldShouldContain(String fromLocation) {
        SchedulePageAsserter.assertFromFieldContains(fromLocation, driver);
    }

    @When("I enter {string} as to location")
    public void iEnterAsToLocation(String toLocation) {
        schedulePage.enterToLocation(toLocation);
    }

    @Then("To field should contain {string}")
    public void toFieldShouldContain(String toLocation) {
        SchedulePageAsserter.assertToFieldContains(toLocation, driver);
    }

    @When("I select the second connection")
    public void iSelectTheSecondConnection() {
        connectionsPage.moveToFirstConnection();
        connectionsPage.clickSecondConnection();
        connectionsPage.waitForBuyButton();
    }

    @Then("I see Buy tickets button")
    public void iSeeBuyTicketsButton() {
        ConnectionsPageAsserter.assertPurchaseTicketAvailable(driver);
    }

    @When("I buy second ticket")
    public void iBuySecondTicket() {
        connectionsPage.buySecondTicket();
    }

    @Then("Login page is opened")
    public void loginPageIsOpened() {
        loginPage.waitForElementsLoaded();
        LoginPageAsserter.assertPurchaseTicketAvailable(driver);
    }

    @When("I choose to continue as a guest")
    public void iChooseToContinueAsAGuest() {
        loginPage.clickPurchaseAsGuest();
    }

    @Then("Login as guest button appears")
    public void loginAsGuestButtonAppears() {
        loginPage.waitForLoginAsGuest();
    }

    @When("I choose to login as a guest")
    public void iChooseToLoginAsAGuest() {
        loginPage.clickLoginAsGuest();
    }

    @Then("Travel Data page is opened")
    public void travelDataPageIsOpened() {
        travelDataPage.waitForElementsLoaded();
        TravelDataPageAsserter.assertElementsVisible(driver);
    }

    @When("I enter {string} as email")
    public void iEnterEmail(String email) {
        travelDataPage.setEmail(email);
    }

    @Then("Email field contains {string}")
    public void emailFieldContains(String email) {
        TravelDataPageAsserter.assertEmailFieldContains(email, driver);
    }

    @When("I enter {string} as name")
    public void iEnterAsName(String name) {
        travelDataPage.selectNameField();
        travelDataPage.setFirstName(name);
    }

    @Then("Name field contains {string}")
    public void nameFieldContains(String name) {
        TravelDataPageAsserter.assertNameFieldContains(name, driver);
    }

    @When("I enter {string} as surname")
    public void iEnterAsSurname(String surname) {
        travelDataPage.selectSurnameField();
        travelDataPage.setSurname(surname);
    }

    @Then("Surname field contains {string}")
    public void surnameFieldContains(String surname) {
        TravelDataPageAsserter.assertSurnameFieldContains(surname, driver);
    }

    @When("I enter {string} as birthday")
    public void iEnterAsBirthday(String birthday) {
        travelDataPage.setBirthday(birthday);
    }

    @Then("Birthday field contains {string}")
    public void birthdayFieldContains(String birthday) {
        TravelDataPageAsserter.assertBirthdayFieldContains(birthday, driver);
    }

    @When("I choose No discount available")
    public void iChooseNoDiscountAvailable() {
        travelDataPage.openDiscountsDropdown();
        travelDataPage.setNoDiscount();
    }

    @Then("I see No discount selected")
    public void iSeeNoDiscountSelected() {
        TravelDataPageAsserter.assertNoDiscountSelected(driver);
    }

    @Then("I click Submit button")
    public void iClickSubmitButton() {
        travelDataPage.submit();
    }
}
