package pac1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNG {
	
		
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

		@Test
		public void test()
		{
			System.out.println("Test Method");
		}

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
		
}
