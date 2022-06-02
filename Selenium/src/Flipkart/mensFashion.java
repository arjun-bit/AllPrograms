package Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mensFashion {
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement cross = driver.findElement(By.xpath("//button[text()][1]"));
		cross.click();
		
		Thread.sleep(2000);
		
		WebElement Fashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		
		
		
		Actions act = new Actions(driver);
		//fashion
		act.moveToElement(Fashion).perform();
		//men's foor
		WebElement mensFoot = driver.findElement(By.xpath("//a[text()='Men Footwear']"));
		act.moveToElement(mensFoot).click().perform();
		
		
		//scroll
		
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
				
		js.executeScript("window.scrollBy(0,500)");
		
//		select woodland brand
		
		Thread.sleep(2000);
		WebElement woodland = driver.findElement(By.xpath("//div[@title='WOODLAND']//div[@class='_24_Dny']"));
		woodland.click();
		
	Thread.sleep(2000);
	
	//scroll
	js.executeScript("window.scrollBy(0,4000)");
	
	Thread.sleep(2000);
	
	js.executeScript("window.scrollBy(0,-2000)");
	
	Thread.sleep(2000);
	
	js.executeScript("window.scrollBy(0,-1800)");
	Thread.sleep(2000);
	

	WebElement product = driver.findElement(By.xpath("//a[@title='Men Camel Sports Sandal']"));
	product.click();
	
	}
}