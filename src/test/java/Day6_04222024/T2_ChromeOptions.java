package Day6_04222024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_ChromeOptions {
    public static org.openqa.selenium.By By;

    public static void main(String[] args) {
        //declare and define an option
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start maximized");
        //add option to have it incognito
        options.addArguments("incognito");
        //add headless and just remove the two forward slashes from next line
        //options.addArguments("headless");
        //add webdriver and options
        WebDriver driver = new ChromeDriver(options);
        //go to yahoo
        driver.navigate().to("https://www.yahoo.com/");
        //print out the header text
        String headerText = driver.findElement(By.xpath("//*[@class = '_yb_jujrfs _yb_126z4i9 _yb_w5chp0 _yb_r25x6s']")).getText();
        //print header to the console
        System.out.println("Header is " + headerText);
        //quit browser
        driver.quit();
    }//end of main
}//end of class
