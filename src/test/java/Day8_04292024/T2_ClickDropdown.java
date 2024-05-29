package Day8_04292024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ClickDropdown {
    public static void main(String[] args) throws InterruptedException {
        //select start month from the dropdown
        WebDriver driver = new ChromeDriver();
        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org/");
        //pause for 3 seconds
        Thread.sleep(3000);
        //enter home value
        driver.findElement(By.xpath("//*[@id = 'homeval']")).sendKeys("450000");
        //enter down payment
        driver.findElement(By.xpath("//*[@id = 'downpayment']")).sendKeys("100000");
        //pause for 2 seconds
        Thread.sleep(2000);
        //click on the dropdown for start month
        driver.findElement(By.xpath("//*[@name = 'param[start_month]']")).click();
        //click on May using Xpath select
        driver.findElement(By.xpath("//*[text() = 'May']")).click();
    }//end of main
}//end of class
