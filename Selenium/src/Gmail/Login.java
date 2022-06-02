package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement enterEmail = driver.findElement(By.xpath("//input[@type='email']"));
		enterEmail.sendKeys("Arjunsontakke5@gmail.com");
		
	
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		Thread.sleep(3000);
		
		WebElement tryAgain = driver.findElement(By.xpath("//span[text()='Try again']"));
		tryAgain.click();
		Thread.sleep(3000);
		
		
		
		WebElement createAccount = driver.findElement(By.xpath("(//span[text()='Create an account'])[1]"));
		createAccount.click();
		
	
		
		
		WebElement fName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Thread.sleep(2000);
		fName.sendKeys("Lets");
		
		
		WebElement L_Name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		L_Name.sendKeys("go");
		
		WebElement U_Name = driver.findElement(By.xpath("//input[@type='email']"));
		U_Name.sendKeys("glets8402");
		
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		password.sendKeys("Letsgo@123");
		
		WebElement re_password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		re_password.sendKeys("Letsgo@123");
		
		WebElement Next = driver.findElement(By.xpath("//span[text()='Next']"));
		Next.click();
		Thread.sleep(3000);
		
		
		WebElement contact = driver.findElement(By.xpath("//input[@type='tel']"));
		contact.sendKeys("8855989637");
		
		WebElement c_Next = driver.findElement(By.xpath("//span[text()='Next']"));
		c_Next.click();
		

		
	}
}