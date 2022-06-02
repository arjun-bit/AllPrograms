package screenshot;

import java.io.File;
import java.io.IOException;
import java.lang.Math;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {
	public static void main(String[] args) throws IOException, Throwable  
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		TakesScreenshot t =(TakesScreenshot)driver;
	
//		File source = t.getScreenshotAs(OutputType.FILE);
//		File dest = new File("E:\\Velocity\\New folder (2)\\Test 123.jpeg");
//		FileHandler.copy(source,dest);
		
	
		
		//shortcut
		
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\Velocity\\New folder (2)\\Test 123.jpeg");
		FileHandler.copy(source,dest);
		
	

	}
}
