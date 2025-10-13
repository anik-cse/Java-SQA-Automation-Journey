package selenium.class3.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintAllLinks {
    public static void main(String[] args) throws InterruptedException {

        int waitTime = 1500;

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Parabank
        driver.get("https://parabank.parasoft.com/parabank/");
        Thread.sleep(waitTime);

        // Find all <a> tags
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println("Total links found: " + allLinks.size());

        // Loop through each link and print text + href
        for (WebElement link : allLinks) {
            String linkText = link.getText().trim();
            String linkHref = link.getAttribute("href");
            System.out.println("Link Text: " + (linkText.isEmpty() ? "[No Text]" : linkText));
            System.out.println("Link URL: " + linkHref);
            System.out.println("-----------------------------");
        }

        driver.quit();
    }
}
