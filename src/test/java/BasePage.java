import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;

    // Constructor to initialize WebDriver
    public BasePage() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait for dynamic elements
    }

    // Navigate to a URL
    public void navigateTo(String url) {
        driver.get(url);
    }

    // Close the browser
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
