package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Create Account
			WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
			createNewAccount.click();
			
			Thread.sleep(3000);
	
		//to get the text present on the webelement
		
		WebElement signUp = driver.findElement(By.xpath("//button[text()='Sign Up']"));
				
		String text = signUp.getText();
		boolean result = text.equals("Sign Up");
		System.out.println(result);
		
		if(result)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
