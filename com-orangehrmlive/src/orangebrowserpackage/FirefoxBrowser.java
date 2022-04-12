package orangebrowserpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    public static void main(String[] args) {
        //1: Set up Firefox browser
        String testUrl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");

        //2 method to open Url
        WebDriver driver=new FirefoxDriver();
        driver.get(testUrl);

        //3:Print the title of page
        System.out.println("The title of page:"+driver.getTitle());

        //4:Print the current Url
        System.out.println("Current Url:"+driver.getCurrentUrl());

        //5:Print the pagesource
        System.out.println("Page source:"+driver.getPageSource());

        //6: Enter Email
        WebElement email= driver.findElement(By.id("txtUsername"));
        email.sendKeys("User123@gmail.com");

        // 7: Enter password
        WebElement password=driver.findElement(By.name("txtUsername"));
        password.sendKeys("Orange1");

        //Close browser
        driver.close();


    }
}
