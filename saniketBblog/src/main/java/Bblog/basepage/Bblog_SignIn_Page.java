package Bblog.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Bblog_SignIn_Page {
	

	WebDriver driver;

	public Bblog_SignIn_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement SignInUsername;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement SignInPagePassword;
	
	
	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary pull-xs-right']")
	WebElement SignInButton;
	
	public void SignInMethod() {
		
		try {
			SignInUsername.sendKeys("saniket@outlook.com");
     		SignInPagePassword.sendKeys("saniket");
			Thread.sleep(2000);
			//driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
			SignInButton.click();
			System.out.println("Logged in to the Bblog website");
		}catch(Exception e) {
			System.out.println("Exception is handled");
		}
	
			
	}

	
	

}
