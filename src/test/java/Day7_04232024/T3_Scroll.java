package Day7_04232024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_Scroll {
    public static void main(String[] args) throws InterruptedException {
        //declare and define an option
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized");
        //add option to have it incognito
        options.addArguments("incognito");
        //add webdriver and options
        WebDriver driver = new ChromeDriver(options);
        //go to yahoo
        driver.navigate().to("https://www.mlcalc.com/");
        //pause for 3 seconds
        Thread.sleep(3000);
        //Define the JSE
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down 800 pixels
        jse.executeScript("scroll(0,800)");
        //pause for 3 seconds
        Thread.sleep(3000);
        //scroll back up
        jse.executeScript("scroll(0,-800)");
        //scroll into webElement, we need to define calculate button into WebElement
        WebElement calcButton = driver.findElement(By.xpath("//*[@value = 'Calculate']"));
        //scroll into the view of the calculate button
        jse.executeScript("arguments[0].scrollIntoView(true);",calcButton);
        //pause 4 seconds
        Thread.sleep(4000);
        //quit the browser
        driver.quit();
    }//end of main
}//end of class
