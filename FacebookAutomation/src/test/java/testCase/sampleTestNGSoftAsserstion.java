package testCase;

import java.io.IOException;
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

public class sampleTestNGSoftAsserstion {
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	SoftAssert s;
	
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

		
		 s = new SoftAssert();// on daily work always declare in @BeforeMethod
		
		//actual Result is equal to expected result then test case is passed
		//actual Result is not equal to expected result then test case is fails
		s.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");		
		
		
		//actual Result is equal to expected result then test case is fails
		//actual Result is not equal to expected result then test case is passed
				
		s.assertNotEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
		
		//result == true ==> test case passed
		//result == false ==> test case failed
				
		boolean result = url.equals("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
				
		s.assertTrue(result);
		
		//result == true ==> test case failed
		//result == false ==> test case Passed
					
		s.assertFalse(result);
		
		
		// forcefully fail the test case
		
		s.fail();
		
		
		//to apply the results of the soft assert on the test method
		s.assertAll();// on Daily work declare in every @test class
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	

}


			
