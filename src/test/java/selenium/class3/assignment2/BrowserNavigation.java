package selenium.class3.assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {
        int waitTime = 2000;

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        Thread.sleep(waitTime);

        driver.navigate().to("https://parabank.parasoft.com/parabank/about.htm/");
        Thread.sleep(waitTime);

        driver.navigate().back();
        Thread.sleep(waitTime);

        driver.navigate().forward();
        Thread.sleep(waitTime);

        driver.navigate().refresh();
        Thread.sleep(waitTime);


        driver.quit();
    }
}
