package Practice_Codes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safaridriver_open {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();
        //Navigate to google page
        driver.navigate().to("https://www.google.com");
// lets maximize the screen and hold it for a 3 seconds
        driver.manage().window().maximize();
        //pause the code for 3 seconds
        Thread.sleep(3000);
        //quit the safari browser
        driver.quit();

    }
}
