package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomClass.HomePage;
import pomClass.LoginPage;

public class sampleTestNGHardAssertion {
	WebDriver driver ;
	HomePage hp;
	LoginPage lp;
	
	@BeforeClass
	public void launchinOrangeHRM()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\New folder (2)\\Crome\\chromedriver.exe");

		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeBrowser()
	{
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
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();

		//actual Result is equal to expected result then test case is passed
		//actual Result is not equal to expected result then test case is fails
		
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers", "You are doing good");
		
		Assert.assertEquals(title , "OrangeHRM");
		
		
		//actual Result is equal to expected result then test case is fails
		//actual Result is not equal to expected result then test case is passed
		Assert.assertNotEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
		Assert.assertNotEquals(title , "OrangeHRM");	
		
		
		//result == true ==> test case passed
		//result == false ==> test case failed
		
		boolean result = url.equals("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
			Assert.assertTrue(result);
			
		//result == true ==> test case failed
		//result == false ==> test case Passed
			
			Assert.assertFalse(result);
			
		// forcefully fail the test case
			
			Assert.fail();
			
			
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	

}



