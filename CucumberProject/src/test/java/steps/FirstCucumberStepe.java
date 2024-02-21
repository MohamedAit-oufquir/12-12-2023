package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class FirstCucumberStepe {

    WebDriver driver;

    @Given("I navigate to the orangeHRM site")
    public void Ab() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    }

    @Given("I add valid username")
    public void i_add_valid_username() {
        driver.findElement(By.name("username")).sendKeys("admin");
    }

    @Given("I add valid password")
    public void i_add_valid_password() {
        driver.findElement(By.name("password")).sendKeys("admin123");

    }

    @When("I click on the Login Button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.cssSelector("[type='submit']")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Then("I should be in the dashboard page")
    public void i_should_be_in_the_dashboard_page() {
//        System.out.println("validate dashboard page");
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("dashboard"));
    }

    @Given("I add valid username {string}")
    public void i_add_valid_username(String username) {
        driver.findElement(By.name("username")).sendKeys(username);

    }

    @Given("I add valid password {string}")
    public void i_add_valid_password(String password) {
        driver.findElement(By.name("password")).sendKeys(password);

    }

    @Then("I should be in the dashboard page {string}")
    public void i_should_be_in_the_dashboard_page(String status) {
        if (status.equalsIgnoreCase("pass")) {
            i_should_be_in_the_dashboard_page();
        } else {
            String emessage = driver.findElement(By.className("oxd-alert-content-text")).getText();
            Assert.assertTrue(emessage.equalsIgnoreCase("Invalid credentials"));
        }


    }
}

