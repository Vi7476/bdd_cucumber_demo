package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public GreenCartMainPage greenCartMainPage;
    public TopDealPage topDealPage;
    public CartPage cartPage;
    public WebDriver driver;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public GreenCartMainPage getGreenCartMainPageDriver() {
        greenCartMainPage = new GreenCartMainPage(driver);
        return greenCartMainPage;
    }
    public TopDealPage getTopDealPageDriver(){
        topDealPage = new TopDealPage(driver);
        return topDealPage;
    }
    public CartPage getCartPageDriver(){
        cartPage = new CartPage(driver);
        return cartPage;
    }

}
