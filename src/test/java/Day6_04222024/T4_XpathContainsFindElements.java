package Day6_04222024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static Day6_04222024.T2_ChromeOptions.By;

public class T4_XpathContainsFindElements {
    public static void main(String[] args) throws InterruptedException {
        //declare and define an option
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start maximized");
        //add option to have it incognito
        options.addArguments("incognito");
        //add webdriver and options
        WebDriver driver = new ChromeDriver(options);
        //go to yahoo
        driver.navigate().to("https://www.yahoo.com/");
        //click on finance using contains
        driver.findElements(By.xpath("//*[contains(@class ,'_yb_jujrfs')]")).get(1).click();
        //wait 3 seconds
        Thread.sleep(3000);
        //quit browser
        driver.quit();
    }//end of main
}//end of class


