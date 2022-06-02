package iFrame;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement alertBox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
	alertBox.click();
	
	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
	
	driver.switchTo().window(addr.get(1));
	
	
//	WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
//	tryIt.click();
	
	// we can not go with the above code because it is not the part of the web page is a another HTML document that that page 
	// for this we have to use the iframe here
	
	WebElement iFrameWindow = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));

	//to switch the focus from child browser to the iframe 
	
	driver.switchTo().frame(2);// by index (99% it get failed)
	
	driver.switchTo().frame("iframeResult");//by ID or name value (we use this if name and id is present)
	
	driver.switchTo().frame(iFrameWindow);// by web element (100% this work and maximum this we use this)
	
	WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
	tryIt.click();
	
	
	
	driver.switchTo().parentFrame();// switch to the parent of Iframe
	
	driver.switchTo().defaultContent();// switch from any iframe to main page
	
	}

}
