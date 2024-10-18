import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFormSubmission {
    private BasePage basePage;
    private FormPage formPage;

    // Setup method to initialize the WebDriver and navigate to the page
    @BeforeEach
    public void setUp() {
        // Initialize the BasePage (to setup WebDriver)
        basePage = new BasePage();

        // Open the target URL
        basePage.navigateTo("https://yarygintech.com/form.html");

        // Initialize the FormPage (pass the driver from BasePage)
        formPage = new FormPage(basePage.driver);
    }

    // Test method to submit the form
    @Test
    public void testFormSubmission() {
        // Fill out the form
        formPage.enterName("John");
        formPage.enterLastName("Doe");
        formPage.enterAddress("123 Main Street");
        formPage.enterNotes("This is an automated test note.");

        // Submit the form
        formPage.submitForm();

        // Assert that the confirmation message is displayed
        assertTrue(formPage.isMessageDisplayed(), "Form submission failed or confirmation message not displayed.");
    }

    // Tear down method to close the browser after each test
    @AfterEach
    public void tearDown() {
        // Close the browser
        basePage.closeBrowser();
    }
}
