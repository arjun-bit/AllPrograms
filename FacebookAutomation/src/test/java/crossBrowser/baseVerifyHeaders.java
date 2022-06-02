package crossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomClass.HomePage;
import pomClass.LoginPage;

public class baseVerifyHeaders {
	WebDriver driver;
	LoginPage lp;
	HomePage hp ;
	@Parameters("browser")
	@BeforeTest
	
	public void launchBrowser(String browserName)
	{
		System.out.println(browserName);
		if(browserName.equals("Chrome"))
		{
			 driver = Base.openChromeBrowser();// upcasting is used here for cross browser testing
		}
		if(browserName.equals("Opera"))
		{
			 driver = Base.openOpera();// upcasting is used here for cross browser testing
		}
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	@BeforeClass
	
	public void createPomObject()
	{
		 lp = new LoginPage(driver);
		 hp = new HomePage(driver);
	}
	
	@BeforeMethod
	
	public void login()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername();
		lp.sendPassword();
		lp.clickOnLoginButton();
	}
	
	@Test
	
	public void clickonAdmin()
	{
		hp.clickOnAdmin();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		
	}
	
	@AfterMethod
	
	public void c()
	{
		System.out.println("Hello");
	}
	
	
	@AfterClass()
	
	public void clearObject()
	{
		lp = null;
		hp = null;
	}
	
	@AfterTest
	
	public void closedBrowser()
	{
		driver.close();
		driver = null;
		System.gc();//Grabage Collector 
	}
	
	
	
	
}
