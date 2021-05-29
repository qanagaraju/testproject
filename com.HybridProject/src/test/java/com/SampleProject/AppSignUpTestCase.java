package com.SampleProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TestCases.AppSignUp;
import com.app.Utilities.BaseConfiguration;





//@Listeners(app.Listeners.BaseListener.class)
public class AppSignUpTestCase extends BaseConfiguration {
	
	public AppSignUp signup;
	
	@BeforeSuite
	public void setupsignutpsuite() {
		
		signup = new AppSignUp();
	}
	
	
  @Test
  public void createaccount() {
	  
	  
	 signup.launchbrowser().clicksignupbutton().name().enteremailaddress().enterusername().enterpassword().clicksubmitbutton().clickcheckbox().closetest();
	  System.out.println("launch browser"+"clicbutton");
	  
  }
  
  
  @Test
  public void verify() {
	  
	 boolean benifitslinkpresent =  driver.getPageSource().contains("Full Features & Benefits");
	 Assert.assertTrue(benifitslinkpresent);
	 
	  
  }
  
  
}
