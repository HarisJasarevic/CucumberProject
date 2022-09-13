package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class LoginSteps {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @Given("User navigates to herokuapp website")
    public void user_navigates_to_herokuapp_website() {
        driver.get("https://the-internet.herokuapp.com/login");
    }
    @Given("User enters valid username")
    public void user_enters_valid_username() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
    }
    @Given("User enters valid password")
    public void user_enters_valid_password() {
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    }
    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        driver.findElement(By.cssSelector(".fa")).click();
    }
    @Then("User should be taken to welcome login page")
    public void user_should_be_taken_to_welcome_login_page() {
        Assert.assertTrue(driver.findElement(By.cssSelector(".icon-2x")).isDisplayed());
    }






}//end class
