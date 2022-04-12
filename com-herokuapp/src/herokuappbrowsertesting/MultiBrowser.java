package herokuappbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {

    public static void main(String[] args) {
        String givenUrl = "http://the-internet.herokuapp.com/login";
        String browser = "Edge";

        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            WebDriver webd = new ChromeDriver();
            webd.get(givenUrl);
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            WebDriver webd = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            WebDriver webd = new FirefoxDriver();
        } else {
            System.out.println("Incorrect browser");
        }
    }
}
