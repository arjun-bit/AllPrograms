package P1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //will open url
		Thread.sleep(3000); //3 sec
		
		driver.navigate().to("https://www.selenium.dev/about/"); // will open url but along with that we can also access over back,forward,refresh
		Thread.sleep(3000);
		
		driver.navigate().back();// this is type of method chaining
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);  
		
		driver.navigate().refresh();
		
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.manage().window().minimize();//update in 4.13 version
		Thread.sleep(3000);
		
	//how to change the size of browser
		
		Dimension d = new Dimension(300,700);// L*H PIXEL
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		
	// how to change the position of the browser
		
		Point p = new Point(300,600);// X axis,Y axis PIXEL
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		
		
		driver.close();//close the current tab
		Thread.sleep(3000);
		
		
		driver.quit();//close all the tab or browser
		Thread.sleep(3000);
		
	// TO get url 
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	
		
	// TO get Title
		
// 		String title = driver.getTitle();
// 		System.out.println(title);
		
	}

}
