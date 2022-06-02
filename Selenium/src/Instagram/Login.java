package Instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/?hl=en");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//Login
	WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
	WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	WebElement login = driver.findElement(By.xpath("//div[text()='Log In']"));
	
	email.sendKeys("Arjun");
	pass.sendKeys("Arjun@123");
	login.click();
}
}
