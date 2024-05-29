package actionItems_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_AI03 {
    public static void main(String[] args) throws InterruptedException {
//define the web driver variable
        WebDriver driver = new ChromeDriver();
        //go to bing.com
        driver.navigate().to("https://www.bing.com/?toWww=1&redig=8EB3F6F2F3FA4F2C99C960E70309A8E2");
        //hold the page for 3 seconds
        Thread.sleep(3000);
        //enter cars in the search box
        driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("cars");
        //click submit on search icon
        driver.findElement(By.xpath("//*[@width = '25']")).click();
        //hold the page for 3 seconds
        Thread.sleep(3000);
        //store the result in a string message
        String searchResult = driver.findElement(By.xpath("//*[@class = 'sb_count']")).getText();
        //split the message
        String[] splitMessageArray = searchResult.split(" ");
        //the message is About 94,300,000 results. About is index 0 and number is index 1.
        System.out.println("Search number for car is " + splitMessageArray[1]);
        //click on more on the cars search screen
        driver.findElement(By.xpath("//*[@target = '_self']")).click();
        //click on my bing
        driver.findElement(By.xpath("//*[@href = '/bp/verify?FORM=000061']")).click();
        //hold page for 3 seconds
        Thread.sleep(3000);
        //copy the line to see your profile page......
        String message = driver.findElement(By.xpath("//*[@class = 'myprofile-see-profile']")).getText();
        //quit the driver
        driver.quit();
        System.out.println(message);
    }//end of main
}//end of class
