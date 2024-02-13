package stepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CartPage;
import utils.TestContextSetup;

public class CartPageStepDefinition {
    TestContextSetup testContextSetup;
    CartPage cartPage;

    public CartPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.cartPage = testContextSetup.pageObjectManager.getCartPageDriver();
    }



    @Then("verify that user is able to enter promocode")
    public void verify_that_user_is_able_to_enter_promocode() {
        testContextSetup.reusableMethods.trueAssertionBoolean(cartPage.verifyPromoButton());
    }
    @Then("verify that user is able to place an order")
    public void verify_that_user_is_able_to_place_an_order(){
        testContextSetup.reusableMethods.trueAssertionBoolean(cartPage.verifyPlaceOrderButton());
    }
}
