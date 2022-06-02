package Flipkart;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cart {
public static void main(String args[]) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//Login
	Thread.sleep(3000);
	WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));

	
	
	WebElement email = driver.findElement(By.xpath("(//input[@type = 'text'])[2]"));
	email.sendKeys("8421102653");
	
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("995399");
	
	WebElement loginclick = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	loginclick.click();
	Thread.sleep(3000);
	
	WebElement Search = driver.findElement(By.xpath("//input[@type='text']"));
	Search.sendKeys("realme GT Master Edition");

	WebElement searchicon = driver.findElement(By.xpath("//button[@type='submit']"));
	searchicon.click();
	Thread.sleep(5000);
	
	WebElement product = driver.findElement(By.xpath("//div[text()='realme GT Master Edition (Luna White, 256 GB)']"));
	product.click();
	Thread.sleep(7000);
	
//to handle new tab	
	ArrayList<String> tab =new ArrayList<String>(driver.getWindowHandles());
	
	driver.switchTo().window(tab.get(1));
	

	WebElement productColor = driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]"));
	productColor.click();
	Thread.sleep(3000);
	
	WebElement productStorage = driver.findElement(By.xpath("//a[text()='128 GB']"));
	productStorage.click();
	Thread.sleep(3000);
	
	WebElement pinClick = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	pinClick.click();
	Thread.sleep(3000);
	
	

	WebElement pinClear = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	pinClear.clear();
	Thread.sleep(3000);
	
	WebElement pinEnter = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	pinEnter.sendKeys("411052");
	Thread.sleep(3000);
	
	
//	WebElement pinCheck = driver.findElement(By.xpath("//span[text()='Change']"));
//	pinCheck.click();
//	Thread.sleep(3000);
	
	
	WebElement addToCart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
	addToCart.click();
	
	
}
}