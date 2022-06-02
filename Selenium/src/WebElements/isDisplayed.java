package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
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
			
			//signup
		

		WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstName.sendKeys("Arjun");

		WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		surname.sendKeys("Sontakke");
		
		WebElement signUpEmail = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		signUpEmail.sendKeys("Arjun@123.gmail.com");
		Thread.sleep(3000);
		
		WebElement reSignUpEmail = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		reSignUpEmail.sendKeys("Arjun@123.gmail.com");
		
		WebElement signUpPassword = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		signUpPassword.sendKeys("Arjun@12334");
		
		Thread.sleep(3000);
		
		WebElement custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		//custom.click();
		
		WebElement hidden = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		
		//isDisplayed
		//return = boolean
		//true = is displayed    false= not displayed 
		
		boolean result = hidden.isDisplayed();
		System.out.println(result);
		
		if(result == true)
		{
			System.out.println("Displayed");
		}
		else
		{
			System.out.println("Not Displayed");
			custom.click();
		}
		
		result = hidden.isDisplayed();
		System.out.println("Displayed");
		
		
		WebElement signUp = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		signUp.click();
}
}
