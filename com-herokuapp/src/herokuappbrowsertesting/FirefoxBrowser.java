package herokuappbrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*1. Setup  browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field
8. Close the browse
 */
public class FirefoxBrowser {
    public static void main(String[] args) {
        //Set up browser
        String testUrl="http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");

        //Open URL
        WebDriver webd=new FirefoxDriver();
        webd.get(testUrl);

        // Print the current url
        System.out.println("Current URL: "+webd.getCurrentUrl());

        // Print the title of the page
        System.out.println("title of page: "+webd.getTitle());

        // Print the page source
        System.out.println("Page source: "+webd.getPageSource());

        //Enter the email to email field
        WebElement email=webd.findElement(By.id("username"));
        email.sendKeys("Prime1@gmail.com");

        //Enter the password to password field
        WebElement password=webd.findElement(By.name("password"));
        password.sendKeys("Prime1");

     //Close the browse
        webd.close();


    }
}
