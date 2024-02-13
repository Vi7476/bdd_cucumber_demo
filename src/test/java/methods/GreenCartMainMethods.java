package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.GreenCartMainPage;
import utils.TestContextSetup;

public class GreenCartMainMethods  {
    public WebDriver driver;
    public GreenCartMainMethods(WebDriver driver){this.driver=driver;}
    GreenCartMainPage greenCartMainPage;



    public void searchItem(String request){
        driver.findElement(greenCartMainPage.searchField).sendKeys(request);
    }
    public String productName(){return driver.findElement(greenCartMainPage.productName).getText();}

    public void clickButton(){
        driver.findElement(greenCartMainPage.topDealsButton).click();
    }



}
