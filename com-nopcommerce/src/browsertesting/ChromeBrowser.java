package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
         String givenUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        //Step 1: Set up  browser(set the property to key and value)
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

        //Step :2 method to open Url
        WebDriver driver=new ChromeDriver();
        driver.get(givenUrl);

        //Step 3:Print the title of page
        System.out.println("Title of page:"+driver.getTitle());

        //Step 4:Print the current Url
        System.out.println("Current URL:"+driver.getCurrentUrl());

        //Step 5:Print the pagesource
        System.out.println("PageResourse is:"+driver.getPageSource());

        //Step 6: Enter Email
        WebElement Email= driver.findElement(By.id("Email"));
        Email.sendKeys("User123@gmail.com");

        //step 7: Enter password
        WebElement password= driver.findElement(By.name("Password"));
        password.sendKeys("password321");

        //Step 8: Close the browser
        driver.close();

    }
}
