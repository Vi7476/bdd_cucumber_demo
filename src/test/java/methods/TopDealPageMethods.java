package methods;

import org.openqa.selenium.WebDriver;
import pages.TopDealPage;

public class TopDealPageMethods {
    TopDealPage topDealPage;
    public WebDriver driver;
    public TopDealPageMethods(WebDriver driver){this.driver=driver;}


    public void searchItem(String request){
        driver.findElement(topDealPage.searchField).sendKeys(request);
    }

    public String topDealsProductName(){return driver.findElement(topDealPage.productName).getText();}
}
