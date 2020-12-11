package homeWork10.stepDefinitions;

import homeWork10.abstractClasses.BasePage;
import homeWork10.desktop.CommonAssertions;
import homeWork10.desktop.fragments.AddProductToCartPopup;
import homeWork10.desktop.pages.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class StepDefinitions extends BasePage {
    AddProductToCartPopup addProductToCartPopup = new AddProductToCartPopup();
    CartPage cartPage = new CartPage();
    static CommonAssertions commonAssertions = new CommonAssertions();
    HomePage homePage = new HomePage();
    OrderSummaryPage orderSummaryPage = new OrderSummaryPage();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    RegisterPage registerPage = new RegisterPage();
    SearchResultPage searchResultPage = new SearchResultPage();

    @And("^The user is redirected to Add product to cart popup$")
    public void theUserIsRedirectedToPopup() {
        addProductToCartPopup.verifyAddProductToCartPopupIsOpen();
    }

    @And("^The user is redirected to the ([a-z, A-Z]{1,}) page$")
    public void theUserIsRedirectedToPage(String pageName) {
        commonAssertions.verifyPageIsOpen(pageName);
    }

    @And("^The user clicks on ([a-z, A-Z]{1,}) button$")
    public void theUserClicksOnButton(String buttonName) {
        clickButton(buttonName);
    }

    @And("^The user can view order summary$")
    public void theUserCanViewOrderSummary(DataTable table) {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        rows.forEach(row -> cartPage.verifyEqualsValue(row));
    }

    @Then("^The user can see the final order review$")
    public void theUserCanSeeTheFinalOrderReview(DataTable table) {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        rows.forEach(row -> orderSummaryPage.verifyFieldValueEqualsAmount(row));
    }

    @Given("^An anonymous user opens Home page$")
    public void anonymousUserOpensHomePage() {
        homePage.navigateToHomePage();
    }

    @And("^The user searches for the product id \"(.*?)\"$")
    public void theUserSearchesForTheProductId(String productId) {
        homePage.enterValueToSearchField(productId);
        homePage.clickSearchButton();
    }

    @And("^The user enters a guest e-mail address \"(.*?)\" to ([a-z, A-Z]{1,}) field$")
    public void theUserEntersEmailAddress(String emailAddress, String fieldName) {
        registerPage.setGuestEmail(fieldName, emailAddress);
    }

    @And("^The user clicks on the product with the product id \"(.*?)\"$")
    public void theUserClicksOnTheProduct(String productId) {
        searchResultPage.openProductDetails(productId);
    }

}
