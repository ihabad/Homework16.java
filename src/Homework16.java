import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework16 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up Chrome driver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

    @Test
    public void registrationNavigation() {
        // Navigate to "https://bbb.testpro.io/"
        driver.get("https://bbb.testpro.io/");

        // Click Registration link
        WebElement registrationLink = driver.findElement(By.linkText("Registration"));
        registrationLink.click();

        // Validate that you are redirected to Registration page
        String expectedTitle = "Registration";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
