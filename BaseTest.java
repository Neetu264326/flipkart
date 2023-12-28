package item.com;

import java.io.IOException;
import java.io.File;
import java.util.concurrent.TimeUnit;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.reporters.Files;

public class BaseTest {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "G:\\NeetuWorkSpace\\AutomationFrameWork\\src\\test\\java\\item\\com\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
      //  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys(" chanel BAGS");


        WebElement e =driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
        e.sendKeys("chanel BAGS");
        // Keys.ENTER with sendKeys
        e.sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div/div/img")).click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(50,2500)");
        System.out.println("scroll");
       // driver .findElement(By.xpath("//*[@class=\"_2B099V\"][1]")).click();
       System.out.println("item");

        TakesScreenshot ts=(TakesScreenshot)driver;

        File source=ts.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(source,new File("G:\\NeetuWorkSpace\\AutomationFrameWork\\src\\test\\java\\item\\com\\chromedriver.png"));
        System.out.println("screenshot");
       // driver.quit();

    }
}
