package stepdefnition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import lumabase.Baseclass;
import lumapom.Login;
import runner.Runner;
import java.io.*;

public class Stepfile extends Baseclass {
	
	
	public static WebDriver driver = Runner.driver;
	  Login log = new Login(driver);
	 
	@Given("User launch the magneto url")
	public void user_launch_the_magneto_url() {
		BrowserLaunch("https://magento.softwaretestingboard.com/");
	}
	
	

	@When("User click the SignIn tab")
	public void user_click_the_sign_in_tab() throws InterruptedException {
		Thread.sleep(3000);
		demo_click(log.getSignin());
		
	}

	@When("User enter the mail id")
	public void user_enter_the_mail_id() {
		Sendkeys(driver,log.getMail(), "kowsalya2596@gmail.com");
	    
	    
	}

	@When("User enter the password")
	public void user_enter_the_password() {
	    
	    
	}

	@When("User click the SignIn button to enter the Homepage")
	public void user_click_the_sign_in_button_to_enter_the_homepage() {
	    
	    
	}

	@Then("User successfully signedIn into the web application")
	public void user_successfully_signed_in_into_the_web_application() {
	    
	    
	}

	@Given("User click the whatsnew tab")
	public void user_click_the_whatsnew_tab() {
	    
	    
	}

	@When("User click the Jackets")
	public void user_click_the_jackets() {
	    
	    
	}

	@When("User click the Juno Jacket in that page")
	public void user_click_the_juno_jacket_in_that_page() {
	    
	    
	}

	@When("User pick the size of the jacket")
	public void user_pick_the_size_of_the_jacket() {
	    
	    
	}

	@When("User Pick the colour of the jacket")
	public void user_pick_the_colour_of_the_jacket() {
	    
	    
	}

	@When("User pick the quantity of the jacket")
	public void user_pick_the_quantity_of_the_jacket() {
	    
	    
	}

	@When("User click the Add to Cart button")
	public void user_click_the_add_to_cart_button() {
	    
	    
	}

	@Then("User successfully ada the product to the cart")
	public void user_successfully_ada_the_product_to_the_cart() {
	    
	    
	}




}
