package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mini_max {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //will open url
		Thread.sleep(3000); //3 sec
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	
	driver.manage().window().minimize();//update in 4.13 version
	
	
	

	
	
	
	
	
	
	
	
	
	}
}
