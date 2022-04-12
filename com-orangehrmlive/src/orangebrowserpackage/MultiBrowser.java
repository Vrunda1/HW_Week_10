package orangebrowserpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    public static void main(String[] args) {
        String testUrl="https://opensource-demo.orangehrmlive.com/";
        String browser="Firefox";

        if(browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
            WebDriver drv=new EdgeDriver();
            drv.get(testUrl);
        }else if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            WebDriver drv=new ChromeDriver();
            drv.get(testUrl);
        }else if(browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
            WebDriver drv=new FirefoxDriver();
        }else{
            System.out.println("Incorrect Browser selection");
        }

    }
}
