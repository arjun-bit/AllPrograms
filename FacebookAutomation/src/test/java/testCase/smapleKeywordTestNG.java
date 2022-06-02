package testCase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class smapleKeywordTestNG {

	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
	}

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method");
	}

//1.priority
	
	
	@Test(priority= 2)
	public void testA()
	{
		System.out.println("TestA Method");
	}
	
	@Test(priority= 1)
	public void testB()
	{
		System.out.println("TestB Method ");
	}

	@Test(priority= 1)
	public void testC()
	{
		System.out.println("TestC Method ");
	}

	@Test(priority= -1)
	public void testD()
	{
		System.out.println("TestD Method ");
	}
	
	@Test // priority will consider as zero
	public void testE()
	{
		System.out.println("TestE Method ");
	}
	
	
	
//2.Invocation Count(Repeat the test case // used for Retesting)



	@Test (invocationCount = 3)
	public void testF()
	{
		System.out.println("TestF Method ");
	}


	@Test (invocationCount = -3)// will not read the test case and will not run it
	public void testG()
	{
		System.out.println("TestG Method ");
	}


	//we can also use multi keyword for one single test case
	
	
	@Test (priority = 1, invocationCount = 2)// will not read the test case and will not run it
	public void testH()
	{
		System.out.println("TestH Method ");
		Assert.fail();
	}

	
//3.dependsOnMethods	
	
	@Test (dependsOnMethods = {"testH"})// TestI will execute only when testH passes because it is depends on TestH
	//If TestH fails then it will skips the TestI but run it 
	public void testI()
	{
		System.out.println("TestI Method ");
	}
	
	
	@Test (dependsOnMethods = {"testH","testG"})
	public void testJ()
	{
		System.out.println("TestJ Method ");
	}
	
	
//4. Enable
	// will not run the test case


	@Test (dependsOnMethods = {"testH","testG"})
	public void testK()
	{
		System.out.println("TestK Method ");
	}
	
	
//5. timeOut
	// this will hold the test case for 3 sec if the test case exceute within 3 sec then okay otherwise it will mark then as failed

	@Test (timeOut = 3000)// 3 sec
	public void testL() throws Exception
	{
		System.out.println("TestL Method ");
		Thread.sleep(4000); // we don't use this. We are using this only for understanding timeOut
		System.out.println("Hello ");
	}
	
}
