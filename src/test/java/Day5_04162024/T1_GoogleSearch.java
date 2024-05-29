package Day5_04162024;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver variable
        WebDriver driver = new ChromeDriver();
        //go to google.com
        driver.navigate().to("https://www.google.com");
        //type cars in the search box
        driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("cars");
        //click or submit the google search button
        driver.findElement(By.xpath("//*[@name = 'btnK']")).submit();
        //pause for 2 seconds
        Thread.sleep(3000);
        //store the result in a string message
        String searchResult = driver.findElement(By.xpath("//*[@id = 'result-stats']")).getText();
        System.out.println("Search result is " + searchResult);
        //exit the chrome brower
        driver.quit();
    }//end of main
}//end of class
