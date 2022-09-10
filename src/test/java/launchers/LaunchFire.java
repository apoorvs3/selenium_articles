package launchers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchFire {
    WebDriver driver;
    @Test
    public void launchFire() {
        System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.google.co.in/");
        driver.quit();
    }
    @Test
    public void launchChrome(){
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.quit();
    }
    @Test
    public void launchEdge(){
        System.setProperty("webdriver.edge.driver", "./msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.google.co.in/");
        driver.quit();
    }
}
