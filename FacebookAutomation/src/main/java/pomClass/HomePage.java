package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	//variables
	
		@FindBy (xpath = "//b[text()='Admin']")
		private WebElement Admin;

		@FindBy (xpath = "//b[text()='PIM']")
		private WebElement PIM;

		@FindBy (xpath = "//b[text()='Leave']")
		private WebElement Leave;

		
		
		//constructor
		
		public HomePage(WebDriver driver)
		{
			this.driver =driver;
			PageFactory.initElements(driver, this);
		}

		
		// method
		
		public void clickOnAdmin()
		{
			Admin.click();
		}
		
		public void clickOnPIM()
		{
			PIM.click();
		}
		
		public void clickOnLeave()
		{
			Leave.click();
		}
		
		
}
