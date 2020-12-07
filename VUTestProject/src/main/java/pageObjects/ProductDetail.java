package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetail {

	
	public WebDriver driver;
	
	public ProductDetail(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
		
	}
	

	public WebElement getQuantityTb() {
		WebElement QuantityTb = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
		QuantityTb.clear();
		return QuantityTb;
	}
	public WebElement getAddToCartBtn() {
		WebElement AddToCartBtn = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
		return AddToCartBtn;
	}	
		
}
