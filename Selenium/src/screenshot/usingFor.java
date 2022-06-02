package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class usingFor {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");

	// to store the image with different name we used for here
	
	for(int i =0 ; i<=5;i++)
	{
	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("E:\\Velocity\\New folder (2)\\Test "+ i +".jpeg");
	FileHandler.copy(source,dest);

	Thread.sleep(1000);
	}		

}	

}
