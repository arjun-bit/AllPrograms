package NewTab;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiChildTabs {
	public static void main(String[] args) throws Throwable {
		
	
	
	System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!461576250419!e!!g!!flip-kart&gclsrc=aw.ds&semcmpid=sem_8024046704_brand_eta_nc_goog&ef_id=Cj0KCQjw4PKTBhD8ARIsAHChzRIBq3MbGNqApdvuuyW8CSVjFVobdvue7SBHMVHEqTPR_jR8Y0zy11YaAgHiEALw_wcB:G:s&s_kwcid=AL!739!3!556022308048!!!g!!&cmpid=sem_9790089436_Catchall_New_dsa_MinusProductPage_goog&gclid=Cj0KCQjw4PKTBhD8ARIsAHChzRIBq3MbGNqApdvuuyW8CSVjFVobdvue7SBHMVHEqTPR_jR8Y0zy11YaAgHiEALw_wcB");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	WebElement cross = driver.findElement(By.xpath("//button[text()][1]"));
	cross.click();
	
	Thread.sleep(2000);
	
	WebElement bag = driver.findElement(By.xpath("//div[text()='Laptop Bags']"));
	bag.click();

	Thread.sleep(3000);
	
	String mainPage= driver.getWindowHandle();// main browser
	System.out.println(mainPage);
	
	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
	
	WebElement bag1 = driver.findElement(By.xpath("//a[text()='zurbaa Men & Women Messenger Office Laptop formal casua...']"));
	
	driver.switchTo().window(addr.get(1));//focus on child browser 1
	System.out.println(driver.getCurrentUrl());
	bag1.click();
	
	
	}
	}
