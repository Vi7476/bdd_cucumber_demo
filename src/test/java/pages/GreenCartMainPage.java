package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GreenCartMainPage {

    WebDriver driver;

    public GreenCartMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public By searchField = By.xpath("//input[@type='search']");
    public By productName = By.xpath("//h4[@class='product-name']");
    public By topDealsButton = By.linkText("Top Deals");
    public By productQuantity = By.xpath("//input[@type='number']");
    public By addQuantityButton = By.xpath("//div/a[@class='increment']");//By.cssSelector("a.increment");//By.linkText("+");
    public By addToCartButton = By.xpath("//button[contains(text(), 'ADD TO CART')]");
    public By cartPageIcon = By.xpath("//img[@alt='Cart']");
    public By proceedToCheckoutButton = By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]");


    public void searchItem(String request) {
        driver.findElement(searchField).sendKeys(request);
    }

    public String productName() {
        return driver.findElement(productName).getText();
    }

    public void clickTopDealsButton() {
        driver.findElement(topDealsButton).click();
    }

    public int actualProductsQuantity() {
        return Integer.parseInt(driver.findElement(productQuantity).getAttribute("value"));
    }

    public void addItems(int quantity) {

        for (int i = actualProductsQuantity(); i <= quantity; i++) {
            if (i < quantity) {
                driver.findElement(addQuantityButton).click();
                actualProductsQuantity();
            } else {
                break;
            }

        }
    }

    public void addProductToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void proceedToCartPage() {
        driver.findElement(cartPageIcon).click();
        driver.findElement(proceedToCheckoutButton).click();
    }


}
