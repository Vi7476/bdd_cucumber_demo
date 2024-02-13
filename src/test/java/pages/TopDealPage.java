package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopDealPage {

    public WebDriver driver;
    public TopDealPage(WebDriver driver){this.driver=driver;}
    public By searchField = By.xpath("//input[@id='search-field']");
    public By productName = By.cssSelector("tr td:nth-child(1)");

    public void searchItem(String request){driver.findElement(searchField).sendKeys(request);}

    public String topDealsProductName(){return driver.findElement(productName).getText();}


}
