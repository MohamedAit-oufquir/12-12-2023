package heroku;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HerokuTestClass {
    WebDriver driver ;
    @BeforeMethod  
    public void startBrowser(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    private void clickElement(String linkName){

        @Test
        public void testDropDown(){
            clickElement("Dropdown");

        }
        @Test
        public void testHover(){
            clickElement("Hover");

        }
    }

}
