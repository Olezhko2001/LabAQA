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
        driver = DriverWrapper.getDriver(Browser.CHROME);
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

    @When("I enter {string} as from location")
    public void iEnterAsFromLocation(String fromLocation) {
        schedulePage.enterFromLocation(fromLocation);
    }

    @Then("From field should contain {string}")
    public void fromFieldShouldContain(String fromLocation) {
        SchedulePageAsserter.assertFromFieldContains(fromLocation, driver);
    }

    @When("I enter  {string} as to location")
    public void iEnterAsToLocation(String toLocation) {
        schedulePage.enterToLocation(toLocation);
    }

    @Then("To field should contain {string}")
    public void toFieldShouldContain(String toLocation) {
        SchedulePageAsserter.assertToFieldContains(toLocation, driver);
    }

    @When("I click Search connections")
    public void iClickSearchConnections() {
        schedulePage.waitForSearchClickable();
        schedulePage.searchConnections();
    }

    @Then("Connections page is opened")
    public void connectionsPageIsOpened() {
        ConnectionsPageAsserter.assertConnectionsOpened(driver);
    }

    @Then("I see {string} as origin location")
    public void iSeeAsOriginLocation(String from) {
        ConnectionsPageAsserter.assertOriginContains(from, driver);
    }

    @Then("I see {string} as destination location")
    public void iSeeAsDestinationLocation(String to) {
        ConnectionsPageAsserter.assertDestinationContains(to, driver);
    }

    @When("I select the second connection")
    public void iSelectTheSecondConnection() {
        connectionsPage.moveToFirstConnection();
        connectionsPage.clickSecondConnection();
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

    @When("I choose to buy as a guest")
    public void iChooseToBuyAsAGuest() {
        loginPage.clickPurchaseAsGuest();
    }

    @Then("Travel Data page is opened")
    public void travelDataPageIsOpened() {
        travelDataPage.waitForElementsLoaded();
        TravelDataPageAsserter.assertElementsVisible(driver);
    }

    @When("I enter {string} as name")
    public void iEnterAsName(String name) {
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

    @When("I select 1st class")
    public void iSelectFirstClass() {
        travelDataPage.moveToTravelOptions();
        travelDataPage.selectFirstClass();
    }

    @Then("I see No discount selected")
    public void iSeeNoDiscountSelected() {
        TravelDataPageAsserter.assertNoDiscountSelected(driver);
    }

    @Then("I see 1st class selected")
    public void iSeeStClassSelected() {
        TravelDataPageAsserter.assertFirstClassSelected(driver);
    }

    @When("I click Submit button")
    public void iClickSubmitButton() {
        travelDataPage.submit();
    }

    @Then("Payment page is opened")
    public void paymentPageIsOpened() {
        paymentPage.waitForElementsLoaded();
        PaymentPageAsserter.assertElementsVisible(driver);
    }

    @When("I enter {string}")
    public void iEnterEmail(String email) {
        paymentPage.moveToEmail();
        paymentPage.enterEmail(email);
    }

    @Then("Email field contains {string}")
    public void emailFieldContains(String email) {
        PaymentPageAsserter.assertEmailFieldContains(email, driver);
    }

    @When("I select credit card payment options")
    public void iSelectCreditCardPaymentOptions() {
        paymentPage.moveToPaymentOptions();
        paymentPage.selectCreditCardPayment();
    }

    @Then("I see credit card option selected")
    public void iSeeCreditCardOptionSelected() {
        PaymentPageAsserter.assertCreditCardOptionSelected(driver);
    }

    @When("I agree to Terms and Conditions")
    public void iAgreeToTermsAndConditions() {
        paymentPage.moveToAgreeToConditions();
        paymentPage.selectAgreeToConditions();
    }

    @Then("I see Terms and Conditions selected")
    public void iSeeTermsAndConditionsSelected() {
        PaymentPageAsserter.assertAgreedToConditions(driver);
    }

    @When("I click purchase button")
    public void iClickPurchaseButton() {
        paymentPage.clickPurchaseButton();
    }

    @Then("I do not get errors")
    public void iDoNotGetErrors() {
        PaymentPageAsserter.assertNoErrorMessage(driver);
    }
}
