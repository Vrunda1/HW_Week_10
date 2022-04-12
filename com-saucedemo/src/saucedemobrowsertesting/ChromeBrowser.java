package saucedemobrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*       1.set up browser
        2. Open URL
        3. Print the title of the page
        4. Print the current url
        5. Print the page source
        6. Enter the email to email field
        7. Enter the password to password field
        8. Close the browser
        */
public class ChromeBrowser {
     public static void main(String[] args) {
         // set up chrome browser
         String baseUrl= "https://www.saucedemo.com/";
         System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

         // Open URL
         WebDriver driver=new ChromeDriver();
         driver.get(baseUrl);

         // Print the title of the page
         System.out.println("Title of page: "+driver.getTitle());

         // Print the current url
         System.out.println("Current URL: "+driver.getCurrentUrl());

         // Print the page source
         System.out.println("Page source: "+driver.getPageSource());

         // Enter the email to email field
         WebElement email= driver.findElement(By.id("user-name"));
         email.sendKeys("Prime123@gmail.com");

         // Enter the password to password field
         WebElement password=driver.findElement(By.name("password"));

         // Close the browser
         driver.close();
     }
 }