package Day8_04292024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class T3_Tabs {
    public static void main(String[] args) throws InterruptedException {
        //select start month from the dropdown
        WebDriver driver = new ChromeDriver();
        //navigate to mortgage calculator
        driver.navigate().to("https://www.fideliscare.org");
        //pause for 3 seconds
        Thread.sleep(3000);
        //click on the big shop for a plan
        driver.findElement(By.xpath("//*[text() = 'Shop For a Plan']")).click();
        //pause for 2 seconds
        Thread.sleep(2000);
        //click on shop for a plan
        driver.findElements(By.xpath("//*[text() = 'Shop for a Plan']")).get(0).click();
        //pause for 2 seconds
        Thread.sleep(2000);
        //click on find a doctor
        driver.findElement(By.xpath("//*[@href = '/Find-A-Doctor']")).click();
        //store the tabs in an Array list
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the next tab
        driver.switchTo().window(tabs.get(1));
        //pause for 2 seconds
        Thread.sleep(2000);
        //enter a zipcode in the search field
        driver.findElement(By.xpath("//*[@id = 'searchLocation']")).sendKeys("19702");
        //pause for 1 seconds
        Thread.sleep(1000);
       //switch back to the first tab
        driver.switchTo().window(tabs.get(0));
        //click on member tab
        driver.findElement(By.xpath("//*[text() = 'Member']")).click();
    }//end of main
}//end of class
