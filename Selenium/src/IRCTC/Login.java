package IRCTC;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			Thread.sleep(5000);
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			
			WebElement searchText = driver.findElement(By.xpath("//input[@name='q']"));
			searchText.sendKeys("IRCTC");
			
			Thread.sleep(2000);
			WebElement search = driver.findElement(By.xpath("//span[text()='IRCTC']"));
			search.click();
			
			
			WebElement IRCTC = driver.findElement(By.xpath("//cite[@role = 'text'][1]"));
			IRCTC.click();
		
			Thread.sleep(3000);
			WebElement From = driver.findElement(By.xpath("//input[@role='searchbox'][1]"));
			From.sendKeys("Pune");
			
			WebElement To = driver.findElement(By.xpath("//input[@role='searchbox'][2]"));
			To.sendKeys("Shegaon");
			
			WebElement Classes = driver.findElement(By.xpath("//input[@autocomplete='off'][3]"));
			
			Select s = new Select(Classes);
			
			s.deselectByVisibleText("15");
			
			
			
			
}
}