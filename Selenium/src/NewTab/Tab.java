package NewTab;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	
		WebElement alertBox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement confirmBox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement promtBox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement lineBreak = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
	
		
		alertBox.click();
		confirmBox.click();
		promtBox.click();
		lineBreak.click();
		
		String mainPage= driver.getWindowHandle();// main browser
		System.out.println(mainPage);
		
		//driver.getWindowHandles(); //main browser + all child browser(contains multiple child in it)
		
		
		//to handle the new tab
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		
		for(int  i= 0; i<5;i++)
		{
			System.out.println(addr.get(i));
		}
		
		driver.switchTo().window(addr.get(0));//url of parent browser
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(4));//focus on child browser 1
		System.out.println(driver.getCurrentUrl());	
		
		driver.switchTo().window(addr.get(3));//focus on child browser 2
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(2));//focus on child browser 3
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(1));//focus on child browser 4
		System.out.println(driver.getCurrentUrl());
	}

}
