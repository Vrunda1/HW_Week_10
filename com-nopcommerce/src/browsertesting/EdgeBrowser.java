package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseUrl= "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //Step 1: Set up MSEdge browser
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        //Step :2 method to open Url
        WebDriver driver= new EdgeDriver();
        driver.get(baseUrl);
        //Step 3:Print the title of page
        System.out.println("Title of the page :"+driver.getTitle());
        //Step 4:Print the current Url
        System.out.println("Current URL:"+driver.getCurrentUrl());

        //Step 5:Print the pagesource
        System.out.println("Page resource is:"+driver.getPageSource());

        //Step 6: Enter Email
        WebElement emailfield = driver.findElement(By.id("Email"));
       emailfield.sendKeys("User123@gmail.com");

        //step 7: Enter password
        WebElement passwordfield = driver.findElement(By.name("Password"));
        passwordfield.sendKeys("User123");
        //Step 8: Close the browser
        driver.close();
    }

}
