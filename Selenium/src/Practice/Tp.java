package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tp {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Create Account
		
	
		
		
			WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
			createNewAccount.click();
		
			Thread.sleep(2000);
			

			WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			name.sendKeys("Arjun");
			
			WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
			
			Select a = new Select(day);
			
			a.selectByIndex(5);
			Thread.sleep(2000);
			
					WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
					boolean b = radio.isSelected();
					
					if(b == true)
					{
						System.out.println("It is selected");
					}
					else
					{
						System.out.println("It is not selected");
						radio.click();
					}
	}
			

}
