package Day11_05072024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

import static Day6_04222024.T2_ChromeOptions.By;

public class ReusableMethods {
    public static void clickMethod(WebDriver driver, String xpathValue, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).click();
        }catch(Exception e){
            System.out.println("Unable to click on " + elementName + " due to exception " + e);
        }//end of exception

    }//end of click method+++++++++++++++++++++++++++++++++++++++++++++++++

    public static String captureText(WebDriver driver, String xpathValue, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String result ="";
        try{
            result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue))).getText();
        } catch (Exception e){
            System.out.println("Unable to capture text " +elementName + "due to exception " + e);
        }//end of exception
        return result;

    }//end of capture text method+++++++++++++++++++++++++++++++++++++++++++++++++++

    public static WebDriver setUpChromeDriver(String url){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized", "incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to(url);
        return driver;


    }//end of setupDriver method+++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static void submitMethod(WebDriver driver, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).submit();
        } catch (Exception e) {
            System.out.println("Unable to submit on " + elementName + " due to exception " + e);
        }//end of exception
    }//end of submit method+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static void sendKeysMethod(WebDriver driver, String xpathValue, String userInput, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).sendKeys(userInput);
        } catch (Exception e) {
            System.out.println("Unable to send keys on " + elementName + " due to exception " + e);
        }//end of exception

    }//end of send keys method++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static void clickByIndexMethod(WebDriver driver, String xpathValue, int indexNumber, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathValue))).get(indexNumber).click();
        } //end of try block
        catch (Exception e) {
            System.out.println("Unable to click by index " + elementName.indexOf(indexNumber) + "due to exception " + e);
        }//end of catch block
    }//end of click by index method++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static void scrollIntoViewMethod(WebDriver driver, String xpathValue, String elementName) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(xpathValue)));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathValue)));
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to scroll into view " + elementName + "due to exception " + e);
        }//end of catch block
    }//end of scroll into view method+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static void switchToTabByIndex(WebDriver driver, int switchtab, String elementName) {

        try {
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(switchtab));
        } //end of try block
        catch (Exception e) {
            System.out.println( "Unable to switch tab by index" + elementName + "due to exception" + e);
        }//end of catch block

    }//end of switch tab method

    public static void scrollByPixelMethod(WebDriver driver, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(0,400);");
            //end of try block
        } catch (Exception e) {
            System.out.println("Unable to scroll down due to exception " + e);
        }//end of catch block

    }//end of scroll by pixel method
}//end of class
