package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {
    @FindBy(xpath = "//*[@id='hl1']/li/a") List<WebElement> financialCalculatorLinks;
    WebDriver driver = Browser.getDriver();
    public void clickLinkFromFinancialCalculator(String linkName){
        List<WebElement> elements = driver.findElements(
                By.xpath("//*[@id='hl1']/li/a"));
        for (WebElement element:financialCalculatorLinks) {
            if(element.getText().equalsIgnoreCase(linkName)){
                element.click();
                break;
            }

        }
    }
}