package Day4_04152024;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver
        WebDriver driver = new ChromeDriver();
        //Navigate to google page
        driver.navigate().to("https://www.google.com");
// lets maximize the screen and hold it for a 3 seconds
        driver.manage().window().maximize();
        //pause the code for 3 seconds
        Thread.sleep(3000);
        //quit the chrome browser
        driver.quit();

    }//end of main
}//end of class
