package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.TestContextSetup;

public class Hooks {
    TestContextSetup testContextSetup;

    public Hooks(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @After
    public void afterScenario(){
        testContextSetup.testBase.WebDriverManager().quit();
    }

}
