package saucedemobrowsertesting;
/* Setup  1.set up browser
         2. Open URL
         3. Print the title of the page
         4. Print the current url
         5. Print the page source
         6. Enter the email to email field
         7. Enter the password to password field
         8. Close the browser
         */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    public static void main(String[] args) {
       // Setup Firefox browser
        String setUpUrl="https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");

         // Open URL
        WebDriver drive=new FirefoxDriver();
        drive.get(setUpUrl);

        // Print the title of the page
        System.out.println("Title of page: "+drive.getTitle());

        // Print the current url
        System.out.println("Current Url:"+drive.getCurrentUrl());

        // Print the page source
        System.out.println("Page source: "+drive.getPageSource());

        // Enter the email to email field
        WebElement email=drive.findElement(By.id("user-name"));
        email.sendKeys("testing321@gmail.com");

        // Enter the password to password field
        WebElement password=drive.findElement(By.name("password"));
        password.sendKeys("test123");

        // Close the browser
        drive.close();
    }
}
