package comUiltimateqaBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*      1. Setup Firefox browser
        2. Open URL
        3. Print the title of the page
        4. Print the current url
        5. Print the page source
        6. Enter the email to email field
        7. Enter the password to password field
        8. Close the browse
*/
public class FirefoxBrowserTest {
    public static void main(String[] args) {
        // Setup Firefox browser
        String setUrl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");

        // Open URL
        WebDriver driver=new FirefoxDriver();
        driver.get(setUrl);

        // Print the title of the page
        System.out.println("Title of page: "+driver.getTitle());

        // Print the current url
        System.out.println("Current Url:"+driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page source: "+driver.getPageSource());

        // Enter the email to email field
        WebElement email=driver.findElement(By.id("user[email]"));
        email.sendKeys("test456@gmail.com");

        // Enter the password to password field
        WebElement pw=driver.findElement(By.name("user[password]"));

        // Close the browse
        driver.close();
    }
}
