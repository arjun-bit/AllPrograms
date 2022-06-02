package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/"); //will open url
	Thread.sleep(3000); //3 sec
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	
		//to check element is enabled/ disabled
		//true  = element is enabled
		//false = element is disabled
		
			WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
			WebElement Username = driver.findElement(By.xpath("//input[@name = 'username']"));
			WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
			
//			Username.sendKeys("8421102653");
//			password.sendKeys("Arjun@123");
//			Thread.sleep(2000);
//			
			boolean result = login.isEnabled();
			
			
			
			if(result)
			{
				System.out.println("Is Enable");
			}
			else
			{
				System.out.println("Is Disable");
			}
			
			
	}		
}
