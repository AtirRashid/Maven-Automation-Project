package Day14_05202024;

import Day11_05072024.ReusableMethods;
import Day13_05142024.TestParent;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_GoogleInheritance_Loggers extends TestParent {

    @Test
    public void tc001_verifyGoogleTitle(){
        //navigate to google homepage
        driver.navigate().to("https://www.google.com");
        //store the title in a string
        String actualTitle = driver.getTitle();
        //store the expected title
        String expectedTitle = "Google";
         //assert the 2 titles
        Assert.assertEquals(actualTitle,expectedTitle);
    }//end of test case 1

    @Test
    public void tc002_searchForACar(){
        //navigate to google home page
        driver.navigate().to("https://www.google.com");
        //search for a car
        ReusableMethods_Loggers.sendKeysMethod(driver, logger,"//*[@name = 'q']", "bmw", "Google Search");
        //hit submit
        ReusableMethods_Loggers.submitMethod(driver, logger,"//*[@name = 'btnK']", "Submit Button");
    }//end of test case 2

    @Test
    public void tc003_captureSearchResult(){
        // click on the tools button
        ReusableMethods_Loggers.clickMethod(driver, logger,"//*[@id = 'hdtb-tls']","Tools Button");
        //store the search result into a string variable
        String actualGoogleSearchResult = ReusableMethods.captureText(driver,"//*[@id = 'result-stats']", "Search Result" );
        String expectedGoogleSearchResult = "About 1,390,000,000 results (0.51 seconds)";
        //Assert the search results
        Assert.assertEquals(actualGoogleSearchResult,expectedGoogleSearchResult);
    }//end of test case 3

}//end of class

