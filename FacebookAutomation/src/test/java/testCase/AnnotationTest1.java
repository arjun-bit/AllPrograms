package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClass.HomePage;
import pomClass.LoginPage;

public class AnnotationTest1 {
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	
	
	@BeforeClass
	public void launchinOrangeHRM()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.close();
	}
	
	@BeforeMethod
	public void Login()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginPage lp = new LoginPage(driver);
		lp.sendUsername();
		lp.sendPassword();
		lp.clickOnLoginButton();
		
		 hp = new HomePage(driver);
		
	}
	
	@Test
	
	public void verifyTheAdmin()
	{
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
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	

}
