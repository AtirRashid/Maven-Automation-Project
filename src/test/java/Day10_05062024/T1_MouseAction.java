package Day10_05062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_MouseAction {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //declare chrome arguments
        options.addArguments("incognito");
        options.addArguments("full-screen");
        //define web driver
        WebDriver driver = new ChromeDriver(options);
        //navigate to usps
        driver.navigate().to("https://www.usps.com/");
        //pause for 2 seconds
        Thread.sleep(2000);
        //define actions command
        Actions mouseAction = new Actions (driver);
        //hover over "Send"
        try{
            WebElement sendTab = driver.findElement(By.xpath("//*[text()='Send']"));
        mouseAction.moveToElement(sendTab).perform();

        }catch (Exception e) {
            System.out.println("Unable to hover over 'Send' tab" + e);
        }//end of hovering exception
        //pause for 2 seconds
        Thread.sleep(2000);
        //click on "look up a zip code" from drop down list
        try{
            WebElement zipCodeLookUp = driver.findElement(By.xpath("//*[text()='Look Up a ZIP Code']"));
            mouseAction.moveToElement(zipCodeLookUp).click().perform();

        }catch (Exception e){
            System.out.println("unable to click on look up a zip code" +e);
        }//end of look up a zip code exception
        //click on find cities by zipcode
        try{
            WebElement findCitiesByZipCode = driver.findElement(By.xpath("//*[text()='Find Cities by ZIP']"));
            mouseAction.moveToElement(findCitiesByZipCode).click().perform();

        }catch (Exception e){
            System.out.println("unable to click on find cities by zip code" +e);
        }//end of find cities by zip code exception
        //enter your zip code
        try{
            WebElement ZipCode = driver.findElement(By.xpath("//*[@id='tZip']"));
            mouseAction.moveToElement(ZipCode).click().sendKeys("19702").perform();

        }catch (Exception e){
            System.out.println("unable to enter zip code" +e);
        }//end of entering zip code exception

    }//end of main
}//end of class
