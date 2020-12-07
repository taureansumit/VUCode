package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {

	
	public WebDriver driver;

	WebElement SuccessMsgTxt = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"));
	WebElement QuantityTxt = driver.findElement(By.xpath("//*[@id=\"layer_cart_product_quantity\"]"));
	WebElement PriceTxt = driver.findElement(By.xpath("//*[@id=\"layer_cart_product_price\"]"));
	WebElement ItemName=driver.findElement(By.xpath("//*[@id=\"layer_cart_product_title\"]"));

	public WebElement getSuccessMsgTxt() {
		return SuccessMsgTxt;
	}
	public WebElement getQuantityTxt() {
		return QuantityTxt;
	}
	public WebElement getPriceTxt() {
		return PriceTxt;
	}
	public WebElement getItemNameTxt()
	{
		return ItemName;
	}
	
}
