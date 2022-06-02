package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//variables
	
	@FindBy (xpath = "//input[@id = 'txtUsername']")
	private WebElement login;

	@FindBy (xpath = "//input[@id = 'txtPassword']")
	private WebElement password;

	@FindBy (xpath = "//input[@class='button']")
	private WebElement loginButton;

	 WebDriver driver;

	
	
	//constructor
	//driver1 = driver = new chrome driver
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	
	// method
	
	public void sendUsername()
	{
		login.sendKeys("Admin");
	}
	
	public void sendPassword()
	{
		password.sendKeys("admin123");
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	//or
	
	public void loginToApplication()
	{
		login.sendKeys("Admin");
		password.sendKeys("admin123");
		loginButton.click();
	}
}
