package selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //Wait timer
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Current Title: " + driver.getTitle());

        //Sleep timer
        Thread.sleep(2000);

        //Sending login username and password
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //Sleep timer
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
    }
}
