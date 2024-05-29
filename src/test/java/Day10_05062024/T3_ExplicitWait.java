package Day10_05062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T3_ExplicitWait {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        //declare chrome arguments
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        //define web driver
        WebDriver driver = new ChromeDriver(options);
        //navigate to ups
        driver.navigate().to("https://www.ups.com/");
        //declare explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        //click on tracking
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()= 'Tracking']"))).click();
        }catch(Exception e){
                System.out.println("Unable to click on tracking " +e);
            }//end of tracking exception
        //click on track a package
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()= 'Track a Package']"))).click();
        }catch(Exception e) {
            System.out.println("Unable to click on track a package " + e);
        }//end of track a package exception
    }//end of main
}//end of class
