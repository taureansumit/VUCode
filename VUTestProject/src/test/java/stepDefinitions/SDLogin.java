package stepDefinitions;

import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.SignInPage;
import pageObjects.RegisterPage;
import resources.base;

public class SDLogin extends base {


	  @Given("^user is on home page to validate login$")
	    public void user_is_on_home_page_to_validate_login() throws Throwable  {
		 driver =initializeDriver();  
	    }

    @And("^Click on Signin link to land on Secure sign in Page$")
    public void click_on_signin_link_to_land_on_secure_sign_in_page() throws Throwable {
    	LandingPage LP= new LandingPage(driver);
    	LP.SignInLink().click();
    }

    @When("^User enters (.+) and clicks create account button$")
    public void user_enters_and_clicks_create_account_button(String email) throws Throwable {

    	SignInPage SignIn = new SignInPage(driver);
    	SignIn.getEmaiTb().sendKeys(email);
    	SignIn.getSigninBtn().click();
    }

    @And("^User enters (.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+) and click register button$")
    public void user_enters_and_click_register_button(String firstname, String lastname, String password, String address, String city, String state, String country, String postcode, String mobile) throws Throwable {
    	RegisterPage Register = new RegisterPage(driver);
    	Register.getFnameTb().sendKeys(firstname);
    	Register.getLnameTb().sendKeys(lastname);
    	Register.getPasswdTb().sendKeys(password);
    	Register.getAdd1Tb().sendKeys(address);
    	Register.getCityTb().sendKeys(city);
    	Register.getPcodeTb().sendKeys(postcode);
    	Register.getContactTb().sendKeys(mobile);
    	Select StateSel = new Select(Register.getStateSel());
    	StateSel.selectByVisibleText(state);
    	Select CountrySel = new Select(Register.getStateSel());
    	//CountrySel.selectByVisibleText(country); 
    	Register.getSubmitBtn().click();
    }
    
    @Then("^Verify that user is succesfully Registers$")
    public void verify_that_user_is_succesfully_registers() throws Throwable {
    	RegisterPage Register = new RegisterPage(driver);
    	Register.MyAccountTxt().getText();
    }
    



    @And("^User enters Invalid (.+) and click on create account button$")
    public void user_enters_invalid_and_click_on_create_account_button(String email) throws Throwable{

    	SignInPage SignIn = new SignInPage(driver);
    	SignIn.getEmaiTb().sendKeys(email);
    	SignIn.getSigninBtn().click();
    }

    @Then("^Email error is displayed on page$")
    public void email_error_is_displayed_on_page() throws Throwable{
    	SignInPage SignIn = new SignInPage(driver);
    	System.out.println(SignIn.getSigninError().getText());
    }

    @And("^close browsers$")
    public void close_browsers() throws Throwable {
    driver.quit();
    }

}


