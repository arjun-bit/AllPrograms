package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Fluent {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// fluent
		
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10)) //maximum waiting time
				.pollingEvery(Duration.ofSeconds(2)) // frequency
				.ignoring(NoSuchElementException.class); //condition
		
		WebElement elec = fwait.until(new Function<WebDriver, WebElement>() {
		
			public WebElements apply(WebDriver driver)
			{
				return driver.findElement(By.xpath("//table[@id='cuss']//td"));
			}
			
	});


