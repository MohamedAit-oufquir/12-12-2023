//package Calculator;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//public class net {
//    WebDriver driver;
//
//    @BeforeMethod
//    public void openBrowser() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.navigate().to("https://www.calculator.net/");
//    }
//
//
//    @Test
//    public void loginTest1() {
//        driver.findElement(By.id("calcSearchTerm")).sendKeys("gas");
//        driver.findElement(By.id("calcSearchOut")).click();
//        driver.findElement(By.id("right")).sendKeys("12345");
//        driver.findElement(By.id("id=\"uspodreading\"")).sendKeys("45321");
//        driver.findElement(By.name("usgasputin")).clear();
//        driver.findElement(By.name("type=\"text\"")).sendKeys("gas");
//
//
//    }
//}
//
//
