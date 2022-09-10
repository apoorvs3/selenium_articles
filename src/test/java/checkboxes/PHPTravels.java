package checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class PHPTravels {
    WebDriver driver;
    @Test
    public void checkIntoFlight() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/flights");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean one_way = driver.findElement(By.id("one-way")).isSelected();
        if(one_way){
            System.out.println("True");
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.id("round-trip"))).click();
        Thread.sleep(3000);

        int count = driver.findElements(By.tagName("a")).size();
        System.out.println("number of links in page: "+count);

        //tags in header
        WebElement header = driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div"));
        int countheader = header.findElements(By.tagName("a")).size();
        System.out.println("Number of links in header: "+ countheader);

    }
}
