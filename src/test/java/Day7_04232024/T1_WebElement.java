package Day7_04232024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_WebElement {
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
        driver.navigate().to("https://www.mortgagecalculator.org/");
        //declare and store home value and web element
        //this allows you to not inspect every part of the website page. its basically a big shortcut
        WebElement homeValue = driver.findElement(By.xpath("//*[@id = 'homeval']"));
        //clear the home value field
        homeValue.clear();
        //enter 950000 in the home value field
        homeValue.sendKeys("950000");
        //pause it for 3 seconds
        Thread.sleep(3000);
    }//end of main
}//end of class