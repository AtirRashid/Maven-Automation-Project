package Day13_05142024;

import Day11_05072024.ReusableMethods;
import Day14_05202024.ReusableMethods_Loggers;
import org.testng.annotations.Test;

public class T1_Google_Inheritance extends TestParent{
    @Test(priority = 1)
    public void searchForACar(){
        //search for a car
        ReusableMethods.sendKeysMethod(driver, "//*[@name = 'q']", "bmw", "Google Search");
        //hit submit
        ReusableMethods.submitMethod(driver, "//*[@name = 'btnK']", "Submit Button");
    }//end of test case 1

    @Test(priority = 2)
    public void captureSearchResult(){
        // click on the tools button
        ReusableMethods.clickMethod(driver,"//*[@id = 'hdtb-tls']","Tools Button");
        //store the search result into a string variable
        String searchResult = ReusableMethods.captureText(driver,"//*[@id = 'result-stats']", "Search Result" );
        //print out the result stats
        System.out.println("Search Result is " + searchResult);
    }//end of test case 2
}//end of class
