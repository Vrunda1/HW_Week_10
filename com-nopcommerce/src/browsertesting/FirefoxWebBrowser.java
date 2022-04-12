package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebBrowser {
    public static void main(String[] args) {
        String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        //Step 1: Set up Firefox browser(set the property to key and value)
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Step :2 method to open Url
        driver.get(baseUrl);
        //Step 3:Print the title of page
        String title=driver.getTitle();
        System.out.println(title);

        //Step 4:Print the current Url
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);

        //Step 5:Print the pagesource
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        //Step 6: Enter Email
        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("prime123@gmail.com");

        //step 7: Enter password
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("Test123");
        //Step 8: Close the browser
       driver.close();

    }
}
