package Suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample1 {

	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite1");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After Suite1");
	}
	
	@BeforeTest
	public void beforetest() 
	{
		System.out.println("Before Test1");
	}
	
	@AfterTest
	public void aftertest() 
	{
		System.out.println("After Test1");
	}
	
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class1");
	}

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method1");
	}
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class1");
	}

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method1");
	}

	@Test
	public void test()
	{
		System.out.println("Test Method1");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1 Method1 ");
	}

	
}

