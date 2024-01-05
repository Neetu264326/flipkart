package item.com;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class item  extends BaseTest{

    @Test
    public void Search() {
        //  String title = driver.getTitle();
        WebElement search= driver.findElement(By.xpath("//*[@class=\"Pke_EE\"]"));
        search.sendKeys(" girl watch ");
        search  .sendKeys(Keys.ENTER);
         //Assert.assertEquals(title, " Flipkart");
        System.out.println("sendkeys");
    }
    @Test
public  void item(){

        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div/a/div[1]/div/div/div/img"));


        for (WebElement element : elements) {
            element.click();

        }}


    @Test
    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,25000)");
        System.out.println("scroll pag complete");

        System.out.println("scrool");

    }@Test
    public static void cart (){
        WebElement cart= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
        cart.click();
    }

    @Test
    public void getScreenshot(String name) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            try {
                FileHandler.copy(source, new File("./target/" + name + ".png"));
                System.out.println("Screenshot taken");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }
    }


}

