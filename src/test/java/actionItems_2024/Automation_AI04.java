package actionItems_2024;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Automation_AI04 {
    public static void main(String[] args) throws InterruptedException {
        //declare and define an option
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized");
        //add option to have it incognito
        options.addArguments("incognito");
        //add webdriver and options
        WebDriver driver = new ChromeDriver(options);
        //create a zipCode ArrayList
        ArrayList<String> zipCode = new ArrayList<>();
        //add the 3 zipcodes
        zipCode.add("19702");
        zipCode.add("14208");
        zipCode.add("20653");
        //create a forLoop using the 3 zip codes
        for (int i = 0; i < zipCode.size(); i++) {
            //navigate to the weight watchers website
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
            //pause for 2 seconds
            Thread.sleep(2000);
            //enter the zip codes
            driver.findElement(By.xpath("//*[@id = 'location-search']")).sendKeys(zipCode.get(i));
            //pause for 2 seconds
            Thread.sleep(2000);
            //search using the zipcodes
            driver.findElement(By.xpath("//*[@class = 'rightArrow-C_sUu']")).submit();
            //pause for 2 seconds
            Thread.sleep(2000);
            //create an ArrayList for the studio links and put it in a webElements
            ArrayList<WebElement> studioLinks = new ArrayList<>(driver.findElements(By.xpath("//*[@class='container-k2b9Z']")));
            //print out the address
            System.out.println("The address of the different workshops are " + studioLinks.get(i).getText());

            //pause for 2 seconds
            Thread.sleep(2000);
            //create if conditions
            if (i == 0) {
                studioLinks.get(1).click();
            } else if (i == 1) {
                studioLinks.get(2).click();
            } else if (i == 2) {
                studioLinks.get(0).click();
            }//end of if
            //pause for 2 seconds
            Thread.sleep(2000);
            //define the JSE
            JavascriptExecutor JSE = (JavascriptExecutor) driver;
            //store the scroll area in a web element
            WebElement scrollTitle = driver.findElement(By.xpath("//*[@class = 'title-UbUc9']"));
            //scroll to the title
            JSE.executeScript("arguments[0].scrollIntoView(true);", scrollTitle);
            //pause for 2 seconds
            Thread.sleep(2000);
            //store the schedule in a web element
            WebElement schedule = driver.findElement(By.xpath("//*[@class = 'scheduleContainerMobile-ps6Rm']"));
            //print out the schedule
            System.out.println("The schedule is as follows " + schedule.getText());
        }//end of forLoop
        //pause for 2 seconds
        Thread.sleep(2000);
        //close the browser
        driver.quit();

    }//end of main
}//end of class
