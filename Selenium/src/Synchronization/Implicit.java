package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {
	public static void main(String[] args) throws Throwable {
		
		//synchronization     wait
		
		Thread.sleep(3000);
		
		// implicit --- waiting time
		
		//Explicit -- Waiting time + condition
		
		//Fluent --- waiting time + condition + Frequency
	
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	
		WebElement ele1 = driver.findElement(By.xpath("//table[@id = 'cuss']//td"));
		
		WebElement ele2 = driver.findElement(By.xpath("//table[@id = 'customers']//td"));
		
		WebElement ele3 = driver.findElement(By.xpath("//table[@id = 'customers']//td"));
		
	}

}
