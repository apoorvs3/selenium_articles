import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tabs {
    WebDriver driver;
    @Test
    public void handleTabsWindows(){
        System.setProperty("webdriver.edge.driver", "./msedgedriver.exe");
        driver = new EdgeDriver();

    }

}
