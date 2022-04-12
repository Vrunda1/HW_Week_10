package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultiBrowser {
    public static void main(String[] args) {
        String testUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        String browser="chrome";

        if(browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
            WebDriver driver=new EdgeDriver();
            driver.get(testUrl);
        }else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get(testUrl);
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        }else {
            System.out.println("Incorrect Browser");
        }
    }
}
