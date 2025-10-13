package selenium.class3.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllFieldsFormAutomation {
    public static void main(String[] args) throws InterruptedException {

        int waitTime = 1500;

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        // Name
        driver.findElement(By.id("name")).sendKeys("John Doe");
        Thread.sleep(waitTime);

        // Email
        driver.findElement(By.id("email")).sendKeys("john.doe@example.com");
        Thread.sleep(waitTime);

        // Gender (Male)
        driver.findElement(By.cssSelector("input[name='gender']")).click();
        // Mobile
        driver.findElement(By.id("mobile")).sendKeys("1234567890");
        // Date of Birth
        driver.findElement(By.id("dob")).sendKeys("10/10/1995");

        // Subjects
        driver.findElement(By.id("subjects")).sendKeys("Math");

        // Checkbox (Sports)
        driver.findElement(By.id("hobbies")).click();
        Thread.sleep(waitTime);

        // Picture Upload
        WebElement uploadElement = driver.findElement(By.id("picture")); // replace with correct id
        uploadElement.sendKeys("C:\\Users\\Mir Monoarul Alam\\Downloads\\LOGO.png");
        Thread.sleep(waitTime);

        // Current Address
        driver.findElement(By.xpath("//textarea[@placeholder='Currend Address']")).sendKeys("123 Test Street, City");

        // State
        WebElement stateDropdown = driver.findElement(By.id("state"));
        Select state = new Select(stateDropdown);
        state.selectByVisibleText("Rajasthan");

        // City
        WebElement cityDropdown = driver.findElement(By.id("city"));
        Select city = new Select(cityDropdown);
        city.selectByVisibleText("Agra");
        Thread.sleep(waitTime);

        // Submit (Login button)
        driver.findElement(By.cssSelector("input[value='Login']")).click();
        Thread.sleep(waitTime);

        driver.quit();
    }
}
