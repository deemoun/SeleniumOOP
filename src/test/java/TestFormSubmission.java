public class TestFormSubmission {
    public static void main(String[] args) {
        // Initialize the BasePage (to setup WebDriver)
        BasePage basePage = new BasePage();

        // Open the target URL
        basePage.navigateTo("https://yarygintech.com/form.html");

        // Initialize the FormPage (pass the driver from BasePage)
        FormPage formPage = new FormPage(basePage.driver);

        // Fill out the form
        formPage.enterName("John");
        formPage.enterLastName("Doe");
        formPage.enterAddress("123 Main Street");
        formPage.enterNotes("This is an automated test note.");

        // Submit the form
        formPage.submitForm();

        // Check if the confirmation message is displayed
        if (formPage.isMessageDisplayed()) {
            System.out.println("Form submitted successfully, and confirmation message is visible.");
        } else {
            System.out.println("Form submission failed or confirmation message not displayed.");
        }

        // Close the browser
        basePage.closeBrowser();
    }
}
