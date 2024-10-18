import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
    private WebDriver driver;

    // Constructor that accepts the WebDriver instance
    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    // Fill in the Name field
    public void enterName(String name) {
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys(name);
    }

    // Fill in the Last Name field
    public void enterLastName(String lastName) {
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys(lastName);
    }

    // Fill in the Address field
    public void enterAddress(String address) {
        WebElement addressField = driver.findElement(By.id("address"));
        addressField.sendKeys(address);
    }

    // Fill in the Notes field
    public void enterNotes(String notes) {
        WebElement notesField = driver.findElement(By.id("notes"));
        notesField.sendKeys(notes);
    }

    // Submit the form
    public void submitForm() {
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
    }

    // Check if confirmation message is displayed
    public boolean isMessageDisplayed() {
        WebElement messageDiv = driver.findElement(By.id("message"));
        return messageDiv.isDisplayed();
    }
}