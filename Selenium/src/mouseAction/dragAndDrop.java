package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
	public static void main(String[] args) throws Throwable {
		

		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement source = driver.findElement(By.xpath("//img[@id='drag1']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='div2']"));

		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target).perform();//it will not work on every site so tey it on diff sites
		
		System.out.println("End");
}
}