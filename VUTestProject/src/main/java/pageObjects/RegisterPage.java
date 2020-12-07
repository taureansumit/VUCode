package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RegisterPage {

	public WebDriver driver;
	
	
	public RegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
		
	}

	public WebElement getFnameTb() {
		WebElement FnameTb = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		return FnameTb;
	}

	public WebElement getLnameTb() {
		WebElement LnameTb = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		return LnameTb;
	}

	public WebElement getPasswdTb() {
		WebElement PasswdTb = driver.findElement(By.xpath("//input[@id='passwd']"));
		return PasswdTb;
	}

	public WebElement getAdd1Tb() {
		WebElement Add1Tb = driver.findElement(By.xpath("//input[@id='address1']"));
		return Add1Tb;
	}

	public WebElement getCityTb() {
		WebElement CityTb = driver.findElement(By.xpath("//input[@id='city']"));
		return CityTb;
	}

	public WebElement getStateSel() {
		WebElement StateSel = driver.findElement(By.xpath("//select[@id='id_state']"));
		return StateSel;
	}

	public WebElement getCountrySel() {
		WebElement CountrySel = driver.findElement(By.xpath("//select[@id='id_country']"));
		return CountrySel;
	}

	public WebElement getPcodeTb() {
		WebElement PcodeTb = driver.findElement(By.xpath("//input[@id='postcode']"));
		return PcodeTb;
	}

	public WebElement getContactTb() {
		WebElement ContactTb = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		return ContactTb;
	}
	public WebElement getSubmitBtn() {
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id='submitAccount']"));
		return SubmitBtn;
	}
	public WebElement MyAccountTxt()
	{
		WebElement MyAccTxt = driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/span[2]"));
		return MyAccTxt;
	}
}
	
