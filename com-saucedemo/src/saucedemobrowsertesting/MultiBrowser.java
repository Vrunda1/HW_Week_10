package saucedemobrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    public static void main(String[] args) {
        String baseUrl="https://www.saucedemo.com/";
        String browser="Chrome";


        if(browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
            WebDriver driver=new EdgeDriver();
        }else if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
            WebDriver driver=new FirefoxDriver();
        }else {
            System.out.println("Wrong Browser");
        }
    }
}
