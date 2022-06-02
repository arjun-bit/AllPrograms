package htmlTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {
public static void main(String[] args) throws Throwable {
	


	System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	List<WebElement> cells = driver.findElements(By.xpath("//table[@id='customers']//td"));
	
	int size= cells.size();// number of web element
	System.out.println(size);
	
	
	for(int i = 0;i<cells.size();i++)
	{
		String text= cells.get(i).getText();
		System.out.println(text);
	}


//implicit --- Waiting time(The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws a “No Such Element Exception”)
	
//driver.manage().timeouts().implicitlyWait(5000, MILLISECONDS);
}	
}
