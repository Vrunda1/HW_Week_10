package comUiltimateqaBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/*      1. Setup MSEdge browser
        2. Open URL
        3. Print the title of the page
        4. Print the current url
        5. Print the page source
        6. Enter the email to email field
        7. Enter the password to password field
        8. Close the browse
*/
public class EdgeBrowserTest {
    public static void main(String[] args) {
        // Setup edge browser
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        // Open URL
        WebDriver dr = new EdgeDriver();
        dr.get(baseUrl);

        // Print the title of the page
        System.out.println("Title of page :" + dr.getTitle());

        // Print the current url
        System.out.println("Current URL :" + dr.getCurrentUrl());

        // Print the page source
        System.out.println("Page source: " + dr.getPageSource());

        // Enter the email to email field
        WebElement email = dr.findElement(By.id("user[email]"));

        // Enter the password to password field
        WebElement password = dr.findElement(By.name("user[password]"));

        // Close the browse
        dr.close();

    }
}
