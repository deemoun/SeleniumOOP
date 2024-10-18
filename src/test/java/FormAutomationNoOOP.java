import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FormAutomationNoOOP {
    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Initialize ChromeDriver
        WebDriver driver = new FirefoxDriver();

        // Open the webpage
        driver.get("https://yarygintech.com/form.html");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Add implicit wait to handle dynamic elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Interact with form elements
        // Fill out the 'Name' field
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("John");

        // Fill out the 'Last Name' field
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys("Doe");

        // Fill out the 'Address' field
        WebElement addressField = driver.findElement(By.id("address"));
        addressField.sendKeys("123 Main Street");

        // Fill out the 'Notes' field
        WebElement notesField = driver.findElement(By.id("notes"));
        notesField.sendKeys("This is an automated test note.");

        // Submit the form
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();

        // Check if the confirmation message is displayed
        WebElement messageDiv = driver.findElement(By.id("message"));
        if (messageDiv.isDisplayed()) {
            System.out.println("Form submitted successfully, and confirmation message is visible.");
        } else {
            System.out.println("Form submission failed or confirmation message not displayed.");
        }

        // Close the browser
        driver.quit();
    }
}