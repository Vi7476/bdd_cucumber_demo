package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class ReusableMethods {
    //TestBase testBase;
    public WebDriver driver;

    public ReusableMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToOtherWindow() {
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        driver.switchTo().window(childWindow);
    }

    public void assertionStrings(String expected, String actual){
        Assert.assertEquals(expected, actual, "actual does not match expected one");
    }
    public void trueAssertionBoolean(boolean element){
        Assert.assertTrue(element, "assertion failed, result is NOT true");
    }
    public void assertionIntegers(int expected, int actual){
        Assert.assertEquals(expected, actual, "actual does not match expected one");
    }
    public void openNeededUrl(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

}
