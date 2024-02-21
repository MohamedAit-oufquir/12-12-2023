package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FistClass {
    WebDriver driver;

    @Test
    public void test1() {
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("my-check-2")).click();
        driver.findElement(By.id("my-radio-2")).click();
        driver.findElement(By.cssSelector("[type='submit']")).click();

        String header = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(header, "Form submitted");
    }

    @Test
    public void windowHandle() {

        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String originalWindow = driver.getWindowHandle();
        driver.findElement(By.linkText("new window")).click();
        for (String winHandel : driver.getWindowHandles()) {

            driver.switchTo().window(winHandel);
        }
        System.out.println("*****" + driver.getCurrentUrl());
        driver.switchTo().window(originalWindow);
        System.out.println("******" + driver.getCurrentUrl());

    }
}