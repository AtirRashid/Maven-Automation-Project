package Day14_05202024;

import Day13_05142024.TestParent;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;

import static Day6_04222024.T2_ChromeOptions.By;

public class ReusableMethods_Loggers {
    public static void clickMethod(WebDriver driver, ExtentTest logger, String xpathValue, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).click();
            logger.log(LogStatus.PASS,"Successfully clicked " + elementName);
        }catch(Exception e){
            System.out.println("Unable to click on " + elementName + " due to exception " + e);
            logger.log(LogStatus.FAIL,"unable to click on " + elementName);
            getScreenShot(driver,elementName,logger);
        }//end of exception

    }//end of click method+++++++++++++++++++++++++++++++++++++++++++++++++

    public static String captureText(WebDriver driver, ExtentTest logger, String xpathValue, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String result ="";
        try{
            result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue))).getText();
            logger.log(LogStatus.PASS,"Successfully captured " + elementName);
        } catch (Exception e){
            System.out.println("Unable to capture text " +elementName + "due to exception " + e);
            logger.log(LogStatus.FAIL,"unable to capture text " + elementName);
            getScreenShot(driver,elementName,logger);
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

    public static void submitMethod(WebDriver driver, ExtentTest logger, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).submit();
            logger.log(LogStatus.PASS,"Successfully submitted " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit on " + elementName + " due to exception " + e);
            logger.log(LogStatus.FAIL,"unable to submit on " + elementName);
            getScreenShot(driver,elementName,logger);
        }//end of exception
    }//end of submit method+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static void sendKeysMethod(WebDriver driver, ExtentTest logger, String xpathValue, String userInput, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).sendKeys(userInput);
            logger.log(LogStatus.PASS,"Successfully sent keys " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to send keys on " + elementName + " due to exception " + e);
            logger.log(LogStatus.FAIL,"unable to send keys on " + elementName);
            getScreenShot(driver,elementName,logger);
        }//end of exception

    }//end of send keys method++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static void clickByIndexMethod(WebDriver driver, ExtentTest logger, String xpathValue, int indexNumber, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathValue))).get(indexNumber).click();
            logger.log(LogStatus.PASS,"Successfully clicked by index " + elementName);
        } //end of try block
        catch (Exception e) {
            System.out.println("Unable to click by index " + elementName.indexOf(indexNumber) + "due to exception " + e);
            logger.log(LogStatus.FAIL,"unable to click by index " + elementName);
            getScreenShot(driver,elementName,logger);
        }//end of catch block
    }//end of click by index method++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static void scrollIntoViewMethod(WebDriver driver, ExtentTest logger, String xpathValue, String elementName) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(xpathValue)));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathValue)));
            logger.log(LogStatus.PASS,"Successfully scrolled into view " + elementName);
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to scroll into view " + elementName + "due to exception " + e);
            logger.log(LogStatus.FAIL,"unable to scroll into view " + elementName);
            getScreenShot(driver,elementName,logger);
        }//end of catch block
    }//end of scroll into view method+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static void switchToTabByIndex(WebDriver driver, ExtentTest logger, int switchtab, String elementName) {

        try {
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(switchtab));
            logger.log(LogStatus.PASS,"Successfully switched to tab by index " + elementName);
        } //end of try block
        catch (Exception e) {
            System.out.println( "Unable to switch tab by index" + elementName + "due to exception" + e);
            logger.log(LogStatus.FAIL,"unable to switch tab by index " + elementName);
            getScreenShot(driver,elementName,logger);
        }//end of catch block

    }//end of switch tab method+++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static void scrollByPixelMethod(WebDriver driver, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(0,400);");
            logger.log(LogStatus.PASS,"Successfully scrolled by pixels " + elementName);
            //end of try block
        } catch (Exception e) {
            System.out.println("Unable to scroll down due to exception " + e);
            logger.log(LogStatus.FAIL,"unable to scroll down due to exception " + elementName);
            getScreenShot(driver,elementName,logger);
        }//end of catch block
    }//end of scroll by pixel method+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static void checkIfStringEquals(String expectedText, String actualText, ExtentTest logger) {
        if (expectedText.equals(actualText)) {
            logger.log(LogStatus.PASS, "Expected Text " + expectedText + " Matches " + actualText);

        } else {
            logger.log(LogStatus.FAIL, "Expected Text " + expectedText + " does not match " + actualText);
        }//end of if else
    }//end of checkString++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //method to capture screenshot when logger fails
    public static void getScreenShot(WebDriver driver, String imageName, ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occurred while taking SCREENSHOT!!! " + e);
        }//end of exception
    }//end of get screenshot method

}//end of class
