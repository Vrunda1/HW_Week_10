package saucedemobrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/*        1.set up browser
         2. Open URL
         3. Print the title of the page
         4. Print the current url
         5. Print the page source
         6. Enter the email to email field
         7. Enter the password to password field
         8. Close the browser
         */
public class EdgeBrowser {
     public static void main(String[] args) {
      //set up browser
         String baseUrl="https://www.saucedemo.com/";
         System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");

         // Open URL
         WebDriver drv=new EdgeDriver();
         drv.get(baseUrl);

         // Print the title of the page
         System.out.println("title of page: "+drv.getTitle());

         // Print the current url
         System.out.println("Current URL: "+drv.getCurrentUrl());

         //Print the page source
         System.out.println("Page source is: "+drv.getPageSource());

         // Enter the email to email field
         WebElement email=drv.findElement(By.id("user-name"));
         email.sendKeys("prime123@gmail.com");

         // Enter the password to password field
         WebElement password= drv.findElement(By.name("password"));
         password.sendKeys("Prime321");

         // Close the browser
         drv.close();


     }
}
