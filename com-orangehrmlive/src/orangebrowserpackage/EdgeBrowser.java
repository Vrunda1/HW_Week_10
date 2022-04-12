package orangebrowserpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {
        //1: Set up MSEdge browser
        String baseUrl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");

        // 2 method to open Url
        WebDriver driver=new EdgeDriver();
        driver.get(baseUrl);

        //3.Print the title of page
        System.out.println("title of page:" +driver.getTitle());

        //4.Print the current Url
        System.out.println("Current URL:"+driver.getCurrentUrl());

        //5:Print the pagesource
        System.out.println("Page source is:"+driver.getPageSource());

        //6: Enter Email
        WebElement email= driver.findElement(By.id("txtUsername"));
        email.sendKeys("Orange123@gmail.com");

        //7: Enter password
        WebElement password=driver.findElement(By.name("txtPassword"));

        //8: Close the browser
        driver.close();



    }
}
