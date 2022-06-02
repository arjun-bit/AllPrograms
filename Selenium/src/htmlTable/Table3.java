//find the broken links and broken images

//broken link
// tagname -- a  attribute-- h

//broken images
// tagname -- img attribute --src


//logic

//String a = "";
//String b = null;
 
//
package htmlTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table3 {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		
		
		
	}

}
