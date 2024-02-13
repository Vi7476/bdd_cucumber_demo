package utils;

import pages.PageObjectManager;

public class TestContextSetup {

    public String homePageProductName;
    public String topDealProductName;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public ReusableMethods reusableMethods;

    public TestContextSetup(){
        testBase=new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
        reusableMethods= new ReusableMethods(testBase.WebDriverManager());
    }


}
