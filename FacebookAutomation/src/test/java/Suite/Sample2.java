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

public class Sample2 {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite2");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After Suite2");
	}
	
	@BeforeTest
	public void beforetest() 
	{
		System.out.println("Before Test2");
	}
	
	@AfterTest
	public void aftertest() 
	{
		System.out.println("After Test2");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class2");
	}

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method2");
	}
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class2");
	}

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method2");
	}

	@Test
	public void test()
	{
		System.out.println("Test Method2");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1 Method2 ");
	}

	
}
