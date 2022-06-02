package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOgin {
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Login
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id = 'pass']"));
		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		
		email.sendKeys("Arjun");
		pass.sendKeys("Arjun@123");
		login.click();
	}

}
