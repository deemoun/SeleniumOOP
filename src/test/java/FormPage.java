import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
    public WebDriver driver;

    // Web elements as instance variables
    private WebElement nameField;
    private WebElement lastNameField;
    private WebElement addressField;
    private WebElement notesField;
    private WebElement submitButton;
    private WebElement messageDiv;

    // Constructor that accepts the WebDriver instance and initializes the elements
    public FormPage(WebDriver driver) {
        this.driver = driver;
        // Initialize the web elements
        nameField = driver.findElement(By.id("name"));
        lastNameField = driver.findElement(By.id("lastName"));
        addressField = driver.findElement(By.id("address"));
        notesField = driver.findElement(By.id("notes"));
        submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        messageDiv = driver.findElement(By.id("message"));
    }

    // Fill in the Name field
    public void enterName(String name) {
        nameField.sendKeys(name);
    }

    // Fill in the Last Name field
    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    // Fill in the Address field
    public void enterAddress(String address) {
        addressField.sendKeys(address);
    }

    // Fill in the Notes field
    public void enterNotes(String notes) {
        notesField.sendKeys(notes);
    }

    // Submit the form
    public void submitForm() {
        submitButton.click();
    }

    // Check if confirmation message is displayed
    public boolean isMessageDisplayed() {
        return messageDiv.isDisplayed();
    }
}
