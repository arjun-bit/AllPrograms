package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();

	//atl.accept();//to click on OK/Yes/Accept/Submit/Allow Button	
	//atl.dismiss();//to click on No/cancel/Deny/Dismiss button
	//atl.getText();//To get the text present on Alert Popup
	//alt.sendkeys("data");// to send the data on alert Popo up	
		
		
		
		
	//thread.sleep(3000); // not allowed to use in this
		//for another alert Pop up
		
//		alt = driver.switchTo().alert();
//		String text = alt.getText();
//		System.out.println(text);
//		alt.accept();
		
		//or//by method chaning
		
		driver.switchTo().alert().accept();
		
	}

}
