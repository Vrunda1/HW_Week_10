package herokuappbrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/*1. Setup Edge browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field
8. Close the browse
 */
public class EdgeBrowser {
    public static void main(String[] args) {
        // Setup Edge browser
        String browse="http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");

        // Open URL
        WebDriver edge=new EdgeDriver();
        edge.get(browse);

        // Print the title of the page
        System.out.println("Title of page: "+edge.getTitle());

        // Print the current url
        System.out.println("Current Url: "+edge.getCurrentUrl());

        // Print the page source
        System.out.println("Page source: "+edge.getPageSource());

        // Enter the email to email field
        WebElement email= edge.findElement(By.id("username"));
        email.sendKeys("Prime1@gmail.com");

        // Enter the password to password field
        WebElement password=edge.findElement(By.name("password"));
        password.sendKeys("Prime1");

        // Close the browse
        edge.close();

    }
}
