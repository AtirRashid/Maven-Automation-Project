package Day13_05142024;

import Day11_05072024.ReusableMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class TestParent {

    public static WebDriver driver;

    public static ExtentReports reports;


    public static ExtentTest logger;

    //declare a global public web driver
    @BeforeSuite
    public void setUpChromeDriver(){
        reports = new ExtentReports("src/main/java/HTML_Report/AutomationReport.html");
        driver = ReusableMethods.setUpChromeDriver("https://www.google.com");
    }//end of before suite

    @BeforeClass
    public void setUpDriver(){
        driver = ReusableMethods.setUpChromeDriver("https://www.google.com");
    }//end of before class

    @BeforeMethod
    public void setTestName (Method methodName){
        logger = reports.startTest(methodName.getName());
    }//end of before method

    @AfterMethod
    public void endTest (){
        reports.endTest(logger);
    }//end of before method

    @AfterClass
    public void quitDriver(){
        driver.quit();
    }//end after class

    @AfterSuite
    public void flushReport(){
        reports.flush();
    }//end of after suite

    public static void assertEqualsLoggers(String expectedText, String actualText) {
        if (expectedText.equals(actualText)) {
            logger.log(LogStatus.PASS, "Expected Text " + expectedText + " Matches " + actualText);
            Assert.assertEquals(actualText,expectedText);
        } else {
            logger.log(LogStatus.FAIL, "Expected Text " + expectedText + " does not match " + actualText);
            Assert.assertEquals(actualText,expectedText);

        }//end of if else
    }//end of assertEqualsLoggers method
}//end of class
