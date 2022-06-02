//how to handle drop list 


package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
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
	
	// how to handle list box /drop down
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s = new Select(month);
	
//	s.selectByIndex(0);//tagname index 0,1,2,........
	
	//or
	
	s.selectByValue("1");//Attribute - value
	
	// or
	
//	s.selectByVisibleText("Jan");//HTML TEXT
	
	WebElement signUp = driver.findElement(By.xpath("//button[text()='Sign Up']"));
	signUp.click();
	
	
	}
}
