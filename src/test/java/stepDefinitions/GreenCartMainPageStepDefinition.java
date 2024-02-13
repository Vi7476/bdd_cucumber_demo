package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;

import pages.GreenCartMainPage;
import utils.TestContextSetup;


public class GreenCartMainPageStepDefinition {
    TestContextSetup testContextSetup;
    GreenCartMainPage greenCartMainPage;


    public GreenCartMainPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.greenCartMainPage = testContextSetup.pageObjectManager.getGreenCartMainPageDriver();
    }


    @Given("User is on GreenCart page")
    public void user_is_on_green_cart_page() {
        String url = "{link_under_NDA}";
        testContextSetup.reusableMethods.openNeededUrl(url);
    }

    @SneakyThrows
    @When("^User searches with shortName (.+) and extracts actual corresponding product name$")
    public void user_searches_with_short_name_and_extracts_actual_corresponding_product_name(String request) {
        greenCartMainPage.searchItem(request);
        testContextSetup.homePageProductName = greenCartMainPage.productName().split("-")[0].trim();
        System.out.println(testContextSetup.homePageProductName);
    }

    @And("User opens TopDeal page")
    public void userOpensTopDealPage() {
        greenCartMainPage.clickTopDealsButton();
    }

    @And("user proceeds to checkout page")
    public void userProceedsToCheckoutPage() {
        greenCartMainPage.proceedToCartPage();
    }

    @And("Adds {string} pieces of product to cart")
    public void addSomePiecesOfProductToCart(String productQuantity) {
        greenCartMainPage.addItems(Integer.parseInt(productQuantity));
        greenCartMainPage.addProductToCart();
        testContextSetup.reusableMethods.assertionIntegers(Integer.parseInt(productQuantity), greenCartMainPage.actualProductsQuantity());
    }
}
