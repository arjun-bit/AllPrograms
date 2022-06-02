package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {
	public static void main(String[] args) throws Throwable {
		

		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement accAndlist = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		WebElement order = driver.findElement(By.xpath("//span[text()='Your Orders']"));
		//How to perform the mouse action on browers
		
		
		Actions act = new Actions(driver);
		
		//
//		act.click();
//		act.doubleClick();
//		act.contextClick();
//		act.moveToElement(target);
//		act.dragAndDrop(source, target);
//		act.build();
//		act.perform();
		//
		
		
		
		act.moveToElement(accAndlist).perform();
		act.moveToElement(order).perform();
		act.click().perform();
		
		
		//or(by method chaining)
		
		
		act.moveToElement(accAndlist).moveToElement(order).click().build().perform();
		
		

	}

}
