package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lombok.SneakyThrows;


import pages.TopDealPage;
import utils.TestContextSetup;

public class TopDealsPageStepDefinition {

    TestContextSetup testContextSetup;
    TopDealPage topDealPage;

    public TopDealsPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.topDealPage = testContextSetup.pageObjectManager.getTopDealPageDriver();
    }

    @SneakyThrows
    @Then("^User searches for same (.+) shortName on Offers page to verify that product exists$")
    public void userSearchesForSameShortNameOnOffersPageToVerifyThatProductExists(String request) {

        testContextSetup.reusableMethods.switchToOtherWindow();
        topDealPage.searchItem(request);

        Thread.sleep(3000);
        testContextSetup.topDealProductName = topDealPage.topDealsProductName();

        System.out.println(testContextSetup.topDealProductName);
    }

    @And("Validate product name matches with homePage product name")
    public void validateProductNameMatchesWithHomePageProductName() {
        testContextSetup.reusableMethods.assertionStrings(testContextSetup.homePageProductName, testContextSetup.topDealProductName);
        System.out.println("compared values are:" + " " + testContextSetup.homePageProductName + " " + "and" + " " + testContextSetup.topDealProductName);
    }


}
