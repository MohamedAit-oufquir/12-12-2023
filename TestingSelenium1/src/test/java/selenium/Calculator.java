package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Calculator {
    WebDriver driver;
    @Test
    public void test1(){
//        String linkName = "payment Calculator";
        driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        List<WebElement>elements = driver.findElements(By.xpath("//*[@id='hl1']/li/a"));
        for(WebElement element:elements){
//            String linkName;
//             if(element.getText().equals(linkName));
//            element.click();
            break;
        }



    }
}
