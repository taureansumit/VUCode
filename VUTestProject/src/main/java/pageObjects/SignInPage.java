package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

	
	public WebDriver driver;
		
	
	public SignInPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
			
			
	}
	

	public WebElement getEmaiTb()
	{
		WebElement EmailTb=driver.findElement(By.xpath("//input[@id='email_create']"));
		return EmailTb;
	}

	public WebElement getSigninBtn()
	{
		WebElement SigninBtn=driver.findElement(By.xpath("//button[@id=\"SubmitCreate\"]"));
		return SigninBtn;
	}
	
	public WebElement getSigninError()
	{
		WebElement SigninError=driver.findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li"));
		return SigninError;
	}

	
}
