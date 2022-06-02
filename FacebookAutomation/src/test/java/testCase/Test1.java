package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClass.HomePage;
import pomClass.LoginPage;

public class Test1 {
public static void main(String[] args) throws InterruptedException  {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();
	
	
	
	
	//1st Test case
	driver.get("https://opensource-demo.orangehrmlive.com/");
	LoginPage lp = new LoginPage(driver);
	lp.sendUsername();
	lp.sendPassword();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

	lp.clickOnLoginButton();
	
	
	//2nd test case
	Thread.sleep(5000);
	HomePage hp = new HomePage(driver);
	hp.clickOnAdmin();
	String url = driver.getCurrentUrl();
	String title = driver.getTitle();
	System.out.println(title);
	
	if(url.equals("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers") && title.equals("OrangeHRM"))
	{
		System.out.println("Admin is opened");
	}
	else
	{
		System.out.println("Admin is not Opened");
	}
	driver.navigate().back();
	Thread.sleep(3000);
	
	hp.clickOnPIM();
	if(url.equals("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList") && title.equals("OrangeHRM"))
	{
		System.out.println("PIM is opened");
	}
	else
	{
		System.out.println("PIM is not Opened");
	}
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	hp.clickOnLeave();
	if(url.equals("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList") && title.equals("OrangeHRM"))
	{
		System.out.println("Leave is opened");
	}
	else
	{
		System.out.println("Leave is not Opened");
	}
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	
	driver.close();
	
	
	
	
}
}
