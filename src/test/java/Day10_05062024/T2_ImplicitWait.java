package Day10_05062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class T2_ImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //declare chrome arguments
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        //define web driver
        WebDriver driver = new ChromeDriver(options);
        //declare and define your global implicit wait for all web elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //navigate to ups
        driver.navigate().to("https://www.ups.com/");
        //pause for 2 seconds
        Thread.sleep(2000);
        //click on tracking
        driver.findElement(By.xpath("//*[text()= 'Tracking']")).click();
        //click on track a package
        driver.findElement(By.xpath("//*[text()= 'Track a Package']")).click();
    }//end of main
}//end  of class
