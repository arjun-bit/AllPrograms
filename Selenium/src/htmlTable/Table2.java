//Get the Table Data in specific format

//Row No 1 , Cell count 3
//Alfreds Futterkiste, Maria Anders, Germany
//
//Row No 2 , Cell count 3
//Centro comercial Moctezuma, Francisco Chang, Mexico
//
//Row No 3 , Cell count 3
//Roland Mendel, Austria, Island Trading

package htmlTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
public static void main(String[] args) throws Throwable {
	
	
	System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
	List<WebElement> cells = driver.findElements(By.xpath("//table[@id='customers']//tr["+ i + "]td"));

	for(int i = 0;i<cells.size();i++)
	{
		
		String text= cells.get(i).getText();
		System.out.println(text);
	}

}
}
