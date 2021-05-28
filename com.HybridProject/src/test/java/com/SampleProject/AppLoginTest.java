package com.SampleProject;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TestCases.AppServices;
import com.app.Utilities.BaseConfiguration;
import com.app.Utilities.CaptureScreenshot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




//@Listeners(app.Listeners.BaseListener.class)
public class AppLoginTest extends BaseConfiguration
{
	
	public  AppServices appservice;
	public static CaptureScreenshot screen;
	public static ExtentReports extent = new ExtentReports("./TestReport/report.html", true);
	public static ExtentTest test = extent.startTest("Verify Login");
	  
	
	public static String[][] logindata = {{"qatrainer","admin12"},{"qatrainer","admin123"},{"tester3","admin3"}};
	
	
	
	@BeforeSuite
	public void setupsuite() {
		
		appservice=new AppServices();
		screen = new CaptureScreenshot();
		
			
	}
	
	
   @Ignore
    @Test(priority=1,description ="verify valid login")
    public void verifyLogin() throws Exception
    {
    	  	
    	//appservice.launchbrowser().clickHomeLink().insertUserName().insertpassword().clicksubmitbutton().clicksignout().close();
    	
    	
    	
    	
    }
    
    
    @Test(priority=2,description ="verify invalid login")
    public void verifyInvalidLogin() throws Exception 
    {
    	for(int i=0;i<logindata.length;i++) {
		 
    	appservice.launchbrowser().clickHomeLink().insertInvalidUserName(logindata[i][0]).insertpassword(logindata[i][1]).clicksubmitbutton().clicksignout().closeBrowser();
    	
    	}
    }
    	
    	
    
    
   
    	
    	
    
    
    
    
   
  @AfterTest
  public void closebrowser() {
	  
	  //appservice.close();
	  
	
	  
  }
  
    
    
}
