package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		

	
		//to get the attribute value of the  element by using attribute name
			
			
		//syntax
			//String attributeValue = user.getAttribute("attributeName");
			
			
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		
				
		String text = email.getAttribute("aria-label");
		
		System.out.println(text);
		
		boolean result = text.equals("Email address or phone number");
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
