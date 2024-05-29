package actionItems_2024;

import Day11_05072024.ReusableMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

import static Day11_05072024.ReusableMethods.setUpChromeDriver;

public class AI_06_WeightWatchers_ResuableMethods {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver variable and set up the chrome driver
        WebDriver driver = setUpChromeDriver("https://www.weightwatchers.com/us/find-a-workshop/");
        // Define ArrayList to store zip codes
        ArrayList<String> zipCodes = new ArrayList<>();
        zipCodes.add("11218");
        zipCodes.add("10308");
        zipCodes.add("11103");
        //start for loop
        for (int i = 0; i < 3; i++) {
            //declare explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            //click on Find a Workshop link
            ReusableMethods.clickMethod(driver,"//*[text() = 'Find a Workshop']","Find a Workshop Link");
            //click on in person link
            ReusableMethods.clickMethod(driver,"//*[text()= 'In-Person']","In-Person Link");
            // Wait 2 seconds
            Thread.sleep(2000);
            // Clear the field and enter zip code
            ReusableMethods.sendKeysMethod(driver,"//*[@id = 'location-search']", zipCodes.get(i),"ZipCode");
            //click on search arrow
            ReusableMethods.clickMethod(driver,"//*[@class='ww button primary cta-DyoKt']","Search Arrow");
            // Wait 2 seconds
            Thread.sleep(2000);
            //declare if else statement
            if (i == 0) {
                ReusableMethods.clickByIndexMethod(driver,"//*[contains(@class, 'linkContainer-C5n9z')]", 1,"2nd Studio Link");
            } else if (i == 1) {
                ReusableMethods.clickByIndexMethod(driver,"//*[contains(@class, 'linkContainer-C5n9z')]", 2,"3rd Studio Link");
            } else if (i == 2) {
                ReusableMethods.clickByIndexMethod(driver,"//*[contains(@class, 'linkContainer-C5n9z')]", 0,"1st Studio Link");
            }//end of if else statement
            // Wait 2 seconds
            Thread.sleep(2000);
            //capture the entire address
            String address = ReusableMethods.captureText(driver,"//*[contains(@class, 'address-FnT8k')]","Entire Address");
            //print out address
            System.out.println("Address is " + address);
            //locate view and scroll into 'Studio Workshops schedule (in-person)' section
            ReusableMethods.scrollIntoViewMethod(driver, "//*[contains(@class, 'title-UbUc9')]", "Workshop Schedule");
            // Wait 2 seconds
            Thread.sleep(2000);
            // Capture and print the entire table with days and hours
            String scheduleTable = ReusableMethods.captureText(driver, "//*[contains(@class, 'scheduleContainerMobile-ps6Rm')]", "Table of Days & Hours");
            //print out schedule table
            System.out.println("Schedule Table " + scheduleTable);
        }//end of for loop
        // Wait 2 seconds
        Thread.sleep(2000);
        //quit driver
        driver.quit();
    }//end of main
}//end of class

