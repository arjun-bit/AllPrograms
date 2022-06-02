package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaters {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

//		By b = By.xpath("//input[@id='email']");
//		WebElement user = driver.findElement(b);
//		user.sendKeys("Arjun");
//		
		
		//or//
		
		WebElement pass = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		pass.sendKeys("Arjun");
		
		WebElement passa = driver.findElement(By.xpath("//input[@id='pass']"));
		passa.sendKeys("Arjun");
		
		
		WebElement login = driver.findElement(By.xpath("//button[text()='Log In']"));
		login.click();
    }
}
