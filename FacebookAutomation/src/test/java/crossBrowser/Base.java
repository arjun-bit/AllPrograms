package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		return driver;
		
	}
	
	public static WebDriver openOpera()
	{
		System.setProperty("webdriver.opera.driver", "E:\\Velocity\\New folder (2)\\Opera\\operadriver_win64\\operadriver.exe");

		WebDriver driver = new OperaDriver();
		return driver;
		
	}


}
