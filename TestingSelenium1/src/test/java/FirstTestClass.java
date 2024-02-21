//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//public class FirstTestClass {
//    WebDriver driver;
//    @BeforeMethod
//    public void openBrowser() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    }
//
//    @Test
//    public void loginTest1(){
//
//        driver.findElement(By.name( "username" )).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys( "admin123");
//        driver.findElement(By.cssSelector("[type='submit']")).click();
//
//    }
//
//    @Test
//    public void loginTest2() {
//
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin12");
//        driver.findElement(By.cssSelector("[type='submit']")).click();
//
//        String txt = driver.findElement(By.cssSelector(".oxd-alert-content-text")).getText();
//        Assert.assertEquals(txt, "Invalid credentials");
//
//
//
//    }
//    @Test
//    public void loginTest3() {
//
//        driver.findElement(By.name("username")).sendKeys("Admi");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.cssSelector("[type='submit']")).click();
//
//        String txt = driver.findElement(By.cssSelector(".oxd-alert-content-text")).getText();
//        Assert.assertEquals(txt, "Invalid credentials");
//    }
//    @Test
//    public void loginTest4() {
//
//        driver.findElement(By.name("username")).sendKeys("Admi");
//        driver.findElement(By.name("password")).sendKeys("admin12");
//        driver.findElement(By.cssSelector("[type='submit']")).click();
//
//        String txt = driver.findElement(By.cssSelector(".oxd-alert-content-text")).getText();
//        Assert.assertEquals(txt, "Invalid credentials");
//    }
//    @AfterMethod
//    public void closeBrowser() {
//        driver.close();
//        driver.quit();
//
//    }
//}

