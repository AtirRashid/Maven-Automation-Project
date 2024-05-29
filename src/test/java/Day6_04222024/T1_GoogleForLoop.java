package Day6_04222024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class T1_GoogleForLoop {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver variable
        WebDriver driver = new ChromeDriver();
//declare an array list
ArrayList<String> carBrands = new ArrayList<>();
carBrands.add("BMW");
carBrands.add("Mercedes");
carBrands.add("Toyota");
for (int i = 0; i < carBrands.size(); i++) {

    //go to google.com
    driver.navigate().to("https://www.google.com");
    //type cars in the search box
    driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys(carBrands.get(i));
    //click or submit the google search button
    driver.findElement(By.xpath("//*[@name = 'btnK']")).submit();
    //pause for 2 seconds
    Thread.sleep(3000);
    //store the result in a string message
    String searchResult = driver.findElement(By.xpath("//*[@id = 'result-stats']")).getText();
    System.out.println("Search result for " + carBrands.get(i) + " is " + searchResult);
    //exit the chrome brower
}//end of loop
    driver.quit();
    }//end of main
}//end of class