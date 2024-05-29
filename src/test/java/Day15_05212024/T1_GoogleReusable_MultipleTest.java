package Day15_05212024;

import Day13_05142024.TestParent;
import Day14_05202024.ReusableMethods_Loggers;
import org.testng.annotations.Test;

public class T1_GoogleReusable_MultipleTest extends TestParent {
    @Test
    public void googleSearch() {
        ReusableMethods_Loggers.setUpChromeDriver("https://www.google.com");
        //send keys from reusable methods
        ReusableMethods_Loggers.sendKeysMethod(driver, logger, "//*[@name = 'q']", "bmw", "Google Search");
        //submit using reusable method
        ReusableMethods_Loggers.submitMethod(driver, logger,"//*[@name = 'btnK']", "Submit Button");
        //click on the tools button
        ReusableMethods_Loggers.clickMethod(driver, logger,"//*[@id = 'hdtb-tls']", "Tools Button");
        String searchResult = ReusableMethods_Loggers.captureText(driver, logger,"//*[@id = 'result-stats']", "Search Result");
        //print out the result stats
        System.out.println("Search result is " + searchResult);
        //exit the chrome browser
        driver.quit();
    }//end of method
}//end of class
