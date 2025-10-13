package selenium.class3.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountryDropdownSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();

        // Wait after page load
        Thread.sleep(2000);

        // State
        WebElement stateDropdown = driver.findElement(By.id("state"));
        Select state = new Select(stateDropdown);
        state.selectByVisibleText("NCR");

        // Wait after page load
        Thread.sleep(2000);

        // City
        WebElement cityDropdown = driver.findElement(By.id("city"));
        Select city = new Select(cityDropdown);
        city.selectByVisibleText("Agra");

        // Wait after page load
        Thread.sleep(2000);

        driver.quit();
    }
}
