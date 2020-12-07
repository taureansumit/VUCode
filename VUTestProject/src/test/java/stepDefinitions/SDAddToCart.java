package stepDefinitions;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.Cart;
import pageObjects.LandingPage;
import pageObjects.ProductDetail;
import pageObjects.SignInPage;
import pageObjects.RegisterPage;
import resources.base;

public class SDAddToCart extends base {

    @Given("^user is on home page to validate cart$")
    public void user_is_on_home_page_to_validate_cart() throws Throwable   {
		 driver =initializeDriver();  
	    }

	    @And("^User clicks on (.+) to land on product detail page$")
	    public void user_clicks_on_to_land_on_product_detail_page(String itemname) throws Throwable {
	    	{    	
	    		LandingPage l=new LandingPage(driver);
	    	ArrayList<WebElement> AllNewProducts= new ArrayList<WebElement>();
	    	AllNewProducts=l.ClickItems();
	    	for (int i=0;i<=AllNewProducts.size();i++)
	    	{
	    		if (AllNewProducts.get(i).getText().equalsIgnoreCase(itemname))
	    		{
	    			AllNewProducts.get(i).click();
	    			break;
	    		}
	    
	    	}
	    }
	    	
	       
	    }

	    @When("^User enters (.+) and clicks on addtocart button$")
	    public void user_enters_and_clicks_on_addtocart_button(String quantity) throws Throwable {
	     ProductDetail PD = new ProductDetail(driver);
	     PD.getQuantityTb().clear();
	     PD.getQuantityTb().sendKeys(quantity);
	     PD.getAddToCartBtn().click();
	    
	    }
	    @Then("^cart page is displayed with the correct (.+),(.+),(.+)$")
	    public void cart_page_is_displayed_with_the_correct_(String itemname, String quantity, String total) throws Throwable {
	        Cart CartPage = new Cart();
	        if (CartPage.getItemNameTxt().getText().equalsIgnoreCase(itemname))
	        		{
	        	  System.out.println("Success");
	        		}
	        if (CartPage.getPriceTxt().getText().equalsIgnoreCase(total))
	        		{
	        	 System.out.println("Success");
	        		}
	        if(CartPage.getQuantityTxt().getText().equalsIgnoreCase(quantity))
	        		{
	        	 System.out.println("Success");
	        		}
	        
	    }

}
	



