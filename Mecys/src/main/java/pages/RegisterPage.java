package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegiterPage {
    @FindBy(id = "customer.firstName")private WebElement firstNameElement;
    @FindBy(id = "customer.lastName")private WebElement lastNameElement;
    @FindBy(id = "customer.address.street")private WebElement streetAddressElement;
    @FindBy(id = "customer.address.state")private WebElement stateAddressElement;
    @FindBy(id = "customer.address.Zipcode")private WebElement zipCode
}
