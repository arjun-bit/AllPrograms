package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createNewAccount {
public static void main(String args[]) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//Login
	WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
	WebElement pass = driver.findElement(By.xpath("//input[@id = 'pass']"));
	
	
	email.sendKeys("Arjun");
	pass.sendKeys("Arjun@123");

	
	//Create Account
	WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	createNewAccount.click();
	
	
	Thread.sleep(3000);// page loading is fast so we have add some delay between that
	
//	Signup
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
	
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	
	Select d = new Select(day);
	d.selectByValue("31");
	
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select m = new Select(month);
	m.selectByVisibleText("Jan");
	
	WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
	
	Select y = new Select(Year);
	
	y.selectByVisibleText("1997");
	
	WebElement Male = driver.findElement(By.xpath("//input[@value='2']"));
	Male.isSelected();
	boolean result = Male.isSelected();
	if(result ==true)
	{
		System.out.println("Good");
	}
	else
	{
		Male.click();
	}
	
	
	
	Thread.sleep(3000);
	
	WebElement signUp = driver.findElement(By.xpath("//button[text()='Sign Up']"));
	signUp.click();
	
}
}	