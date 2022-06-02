package screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UsingRandom {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
			
	// we can also achieve this by generating by Random number	
	

	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("E:\\Velocity\\New folder (2)\\Test "+ Math.random() +".jpeg");
	FileHandler.copy(source,dest);

	
}
}