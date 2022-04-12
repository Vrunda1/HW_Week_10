package herokuappbrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*1. Setup chrome browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field
8. Close the browse
 */
public class ChromeBrowserTesting {
    public static void main(String[] args) {
        // Setup chrome browser
        String setUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        //Open URL
        WebDriver driv = new ChromeDriver();
        driv.get(setUrl);

        //Print the title of the page
        System.out.println("title of page: " + driv.getTitle());

        // Print the current url
        System.out.println("Current URL: " + driv.getCurrentUrl());

        // Print the page source
        System.out.println("Page source: " + driv.getPageSource());

        //Enter the email to email field
        WebElement emailId = driv.findElement(By.id("username"));
        emailId.sendKeys("Prime1@gmail.com");

        //Enter the password to password field
        WebElement password = driv.findElement(By.name("password"));
        password.sendKeys("prime1");

        //Close the browse
        driv.close();


    }
}
