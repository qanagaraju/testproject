package com.SampleProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.TestCases.BasicContactFormServices;
import com.app.Utilities.BaseConfiguration;



//@Listeners(app.Listeners.BaseListener.class)
public class AppBasicContactFormTestCase extends BaseConfiguration{
	
	public static BasicContactFormServices contactform;
	
	
	@BeforeSuite
	public void setupsuite() {
		
		contactform = new BasicContactFormServices();
		
	}
	
  @Test(priority=1)
  //@Parameters({"yourname","email","message"})
  public void verifycontact() throws Exception {
	  
	  
	  contactform.browserlaunch().clicksampleform().clickbasiccontactform().insertyourname().insertmail().insertsubject().clickcontactformsubmit().closeBrowser();
	  
	  
  }
  
  @Test(priority=2)
  public void verifybasicontactlink() throws Exception {
	  
	  contactform.browserlaunch().clicksampleform().clickbasiccontactform().closeBrowser();
	  
	  
  }
  
  
  
  
  
}
