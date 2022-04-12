package orangebrowserpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        //Setup chrome browser
        String testUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        //method to open Url
        WebDriver driver=new ChromeDriver();
         driver.get(testUrl);

         //Print the title of page
        System.out.println("Title of page:"+driver.getTitle());

        //  Print the current Url
        System.out.println("Current Url:"+driver.getCurrentUrl());

        //Print the pagesource
        System.out.println("Page source is:" +driver.getPageSource());

        //Enter Email
        WebElement email=driver.findElement(By.id("txtUsername"));
        email.sendKeys("Orange123@gmail.com");

        //Enter password
        WebElement password=driver.findElement(By.name("txtPassword"));
        password.sendKeys("orange123");
        //Close the browser
        driver.close();






    }
}
