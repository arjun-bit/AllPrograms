package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
// Explicit
		
		WebDriverWait wait = new WebDriverWait(driver,20); // 20 sec
		WebElement ele1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='cuss']//td")));


}
}