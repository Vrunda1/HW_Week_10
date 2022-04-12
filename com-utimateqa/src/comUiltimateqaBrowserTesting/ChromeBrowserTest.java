package comUiltimateqaBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*      1. Setup Chrome browser
        2. Open URL
        3. Print the title of the page
        4. Print the current url
        5. Print the page source
        6. Enter the email to email field
        7. Enter the password to password field
        8. Close the browse
*/
public class ChromeBrowserTest {
    public static void main(String[] args) {
        // Setup Chrome browser
        String givenUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        // Open URL
        WebDriver driver = new ChromeDriver();
        driver.get(givenUrl);

        // Print the title of the page
        System.out.println("Title is: " + driver.getTitle());

        // Print the current url
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page source is:" + driver.getPageSource());

        //Enter the email to email field
        WebElement email = driver.findElement(By.id("user[email]"));

        // Enter the password to password field
        WebElement password = driver.findElement(By.name("user[password]"));

        // Close the browse
        driver.close();

    }
}
