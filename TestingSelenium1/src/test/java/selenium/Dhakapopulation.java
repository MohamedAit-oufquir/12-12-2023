//package selenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//import java.util.List;
//
//public class Dhakapopulation {
//    WebDriver driver;
//    @Test
//    public void Dhaka(){
//        driver= new ChromeDriver();
//        driver.navigate().to("https://www.google.com");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//        driver.findElement(By.name("q")).sendKeys("dhaka");
//        driver.findElement(By.name("btnK")).click();
//
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        List<WebElement> elements=driver.findElements(By.xpath("//h3"));
//        System.out.println(elements.size());
//
//        for(WebElement element:elements){
//            if(element.getText().equals("Dhaka Population 2024")){
//                element.click();
//                break;
//            }
//
//
//        }
//        String url = driver.getCurrentUrl();
//
//
//
//    }
//}
