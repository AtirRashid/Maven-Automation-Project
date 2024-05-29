package Day8_04292024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class T1_SelectMethod {
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
        //select a start month from the start month dropdown
        WebElement startMonth = driver.findElement(By.xpath("//*[@name = 'param[start_month]']"));
        //define the select element
        Select startMonthDropdown = new Select(startMonth);
        //select may from dropdown by visible text (MOST COMMON ONE TO USE)
        //startMonthDropdown.selectByVisibleText("May"); REMOVE THE SLASHES TO SELECT BY text
        //if you want to select by index instead then the following is it
        //FYI index starts with 0
        //startMonthDropdown.selectByIndex(4); REMOVE THE SLASHES TO SELECT BY index
        //if you want to select by value then the following is it
        startMonthDropdown.selectByValue("5");
    }//end of main
}//end of class
