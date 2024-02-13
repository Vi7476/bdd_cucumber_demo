package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver=driver;
    }

    public By applyPromoCodeButton = By.xpath("//button[contains(text(), 'Apply')]");
    public By placeAnOrderButton = By.xpath("//button[contains(text(), 'Place Order')]");

    public boolean verifyPromoButton(){
        return driver.findElement(applyPromoCodeButton).isDisplayed();
    }
    public boolean verifyPlaceOrderButton(){
        return driver.findElement(placeAnOrderButton).isDisplayed();
    }
}
