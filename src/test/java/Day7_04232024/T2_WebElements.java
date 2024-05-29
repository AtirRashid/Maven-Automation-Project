package Day7_04232024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;


public class T2_WebElements {
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
        //store the headers in an arraylist of web elements
        ArrayList<WebElement> yahooHeaders = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class ,'_yb_jujrfs')]")));
        for (int i = 0;i < yahooHeaders.size(); i++) {
            //print out the headers
            System.out.println("Yahoo headers are " + yahooHeaders.get(i).getText());
        }//end of forLoop
        //click on sports header (it is in index 2 as it is in the third position.
        //index begins at 0 fyi
        yahooHeaders.get(2).click();
        //wait 3 seconds
        Thread.sleep(3000);
        //quit browser
        driver.quit();
    }//end of main
}//end of class
