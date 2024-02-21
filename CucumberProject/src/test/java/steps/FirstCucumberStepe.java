package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstCucumberStep {
    @Given("I navigate to the orangeHRM site")
    public void i_navigate_to_the_orange_hrm_site() {
        System.out.println("Navigate to orangeHRM");
// Write code here that turns the phrase above into concrete actions

    }
    @Given("I add valid username")
    public void i_add_valid_username() {
        System.out.println("Add user name");
// Write code here that turns the phrase above into concrete actions

    }
    @Given("I add valid password")
    public void i_add_valid_password() {
        System.out.println("Add password");
// Write code here that turns the phrase above into concrete actions

    }
    @When("I click on the the Login Button")
    public void i_click_on_the_the_login_button() {
        System.out.println("Click login button");
// Write code here that turns the phrase above into concrete actions

    }
    @Then("I should be in the dashboard page")
    public void i_should_be_in_the_dashboard_page() {
        System.out.println("validate dashboard page");
// Write code here that turns the phrase above into concrete actions

    }

    @Given("I add valid username {string}")
    public void i_add_valid_username(String username) {
        System.out.println("*******" + username);
// Write code here that turns the phrase above into concrete actions

    }
    @Given("I add valid password {string}")
    public void i_add_valid_password(String password) {
        System.out.println("########" + password);
// Write code here that turns the phrase above into concrete actions

    }


}
