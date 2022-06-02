package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupanddown {
	public static void main(String[] args) throws Throwable {
		
	
	System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.selenium.dev/downloads/");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement browserTab = driver.findElement(By.xpath("(//div[@class='card-body'])[11]//button[1]"));//xpath of browser 

	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,2000)");//Scroll down by 2000 pixel
	Thread.sleep(3000);
	
	js.executeScript("window.scrollBy(0,-800)");//Scroll up by 800 pixel
	Thread.sleep(3000);
	
	js.executeScript("window.scrollBy(1000,0)");//Scroll right by 1000 pixel
	Thread.sleep(3000);
	
	js.executeScript("window.scrollBy(-1000,0)");//Scroll left by 1000 pixel
	Thread.sleep(3000);
	
	//Scroll to a specific Element
	
	js.executeScript("arguments[0].scrollIntoView(true);",browserTab);
	//Scroll down till the element is not displayed
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
