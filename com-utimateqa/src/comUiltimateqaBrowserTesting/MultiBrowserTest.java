package comUiltimateqaBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    public static void main(String[] args) {
        String browser = "chrome";
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";


        if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            driver.get(baseUrl);

        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(baseUrl);

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            WebDriver driver=new FirefoxDriver();
            driver.get(baseUrl);
        } else {
            System.out.println("Wrong browser");
        }



    }

}
