package utils;

import lombok.SneakyThrows;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public WebDriver driver;

    @SneakyThrows
    public WebDriver WebDriverManager() {
        FileInputStream file = new FileInputStream("src\\test\\resources\\global.properties");
        Properties prop = new Properties();
        prop.load(file);
        ChromeOptions options = new ChromeOptions();
        String browser_properties = prop.getProperty("browser");
        String browser_maven = System.getProperty("browser");

        String browser = browser_maven != null ? browser_maven : browser_properties;

        if (driver == null) {
            if (browser.equalsIgnoreCase("chrome")) {
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);

            }
            if (browser.equalsIgnoreCase("ff")) {
                driver = new FirefoxDriver();
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        return driver;
    }
}
