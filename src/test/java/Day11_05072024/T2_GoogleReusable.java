package Day11_05072024;


import org.openqa.selenium.WebDriver;

import static Day11_05072024.ReusableMethods.setUpChromeDriver;



public class T2_GoogleReusable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = setUpChromeDriver("https://www.google.com");
        //send keys from reusable methods
        ReusableMethods.sendKeysMethod(driver, "//*[@name = 'q']", "bmw", "Google Search");
        //submit using reusable method
        ReusableMethods.submitMethod(driver, "//*[@name = 'btnK']", "Submit Button");
        //click on the tools button
        ReusableMethods.clickMethod(driver,"//*[@id = 'hdtb-tls']", "Tools Button");
        String searchResult = ReusableMethods.captureText(driver, "//*[@id = 'result-stats']", "Search Result");
        //print out the result stats
        System.out.println("Search result is " + searchResult);
        //exit the chrome browser
        driver.quit();
    }//end of method
}//end of class
