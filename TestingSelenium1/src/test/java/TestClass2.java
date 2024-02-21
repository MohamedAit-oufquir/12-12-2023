//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//public class TestClass2 {
//
//            WebDriver driver;
//
//            @BeforeMethod
//            public void openBrowser() {
//                driver = new ChromeDriver();
//                driver.manage().window().maximize();
//                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//                driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//            }
//
//
//            @Test(dataProvider = "testData", dataProviderClass = DataProviderClass.class)
//            public void loginTest1(String userName, String password, String status) {
//                driver.findElement(By.name("username")).sendKeys(userName);
//                driver.findElement(By.name("password")).sendKeys(password);
//                driver.findElement(By.cssSelector("[type='submit']")).click();
//
//                if(status.equals("valid")){
//                    String url = driver.getCurrentUrl();
//                    Assert.assertTrue(url.contains("dashboard"));
//                } else {
//                    String txt = driver.findElement(By.cssSelector(".oxd-alert-content-text")).getText();
//                    Assert.assertEquals(txt, "Invalid credentials");
//                }
//            }
//
//            @AfterMethod
//            public void closeBrowser() {
////        driver.close();
//                driver.quit();
//
//            }
//}
//
//
//

