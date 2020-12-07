package stepDefinitions;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.SignInPage;
import pageObjects.RegisterPage;
import resources.base;

public class SDMegaMenu extends base {
    @Given("^user is on home page to validate MegaMenu$")
    public void user_is_on_home_page_to_validate_megamenu() throws Throwable  {
		 driver =initializeDriver();  
	    }
	  @When("^User hovers on (.+) menu$")
	    public void user_hovers_on_menu(String megamenucat) throws Throwable {
	    	LandingPage l=new LandingPage(driver);	    	
	    	ArrayList<WebElement> AllNewProducts= new ArrayList<WebElement>();
	    	AllNewProducts=l.MegaMenu();
	    	for (int i=0;i<=AllNewProducts.size();i++)
	    	{
	    		if (AllNewProducts.get(i).getText().equalsIgnoreCase(megamenucat))
	    		{
	    			System.out.println("MainMenu Match found");
	    			Actions builder = new Actions(driver);;
	    			builder.moveToElement(AllNewProducts.get(i)).perform();
	    			break;
	    		}
	    	}
	    }
	    

	    @Then("^(.+) is displayed$")
	    public void is_displayed(String megamenusubcat) throws Throwable {
	    		LandingPage l=new LandingPage(driver);	    	
		    	ArrayList<WebElement> AllNewProducts1= new ArrayList<WebElement>();
		    	AllNewProducts1=l.MegaSubMenu();
		    //	System.out.println(AllNewProducts1.size());
		    	Iterator<WebElement> itr =l.MegaSubMenu().iterator();
		    	while (itr.hasNext())
		    		
		    	{
		    		System.out.println(itr.next().getText());
		    		if (itr.next().getText().trim().equalsIgnoreCase(megamenusubcat.trim()))
		    		{
		    			System.out.println("found");
		    			break;
		    		}
		    	}

		    }
	    
}
