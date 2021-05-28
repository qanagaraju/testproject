package com.TestCases;



import java.io.IOException;

import com.Project.Utilities.Objectrep;
import com.app.Utilities.BaseConfiguration;
import com.app.Utilities.CaptureScreenshot;
import com.myApp.utility.CommonUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class AppServices extends BaseConfiguration {
 
	public Objectrep read;
	public static CaptureScreenshot capture;
	
	public static ExtentReports extent = new ExtentReports("./TestReport/report.html", true);
	public static ExtentTest test = extent.startTest("Verify Login");
	
	
	public AppServices launchbrowser() {
		
		read = new Objectrep();
		capture=new CaptureScreenshot();
		
		InvokeBrowser("chrome");
		test.log(LogStatus.INFO, "Launching brower");
		
		return this;
	}
	
	
	
	
	
	
	public AppServices clickHomeLink() throws Exception  {
		
		
		try {
		CommonUtils.clickweblink("xpath", read.getObjects().getProperty("mycontactform_samplelink"), driver);
		
		
		
			
		test.log(LogStatus.INFO,"verify homelink");
   	   
		String screenShotPath = capture.capturescreen(driver,"verify homelink");
        String screen1 = test.addScreenCapture(screenShotPath);
        test.log(LogStatus.INFO, "Snapshot below: "+screen1);
        
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		return this;
	}
	
	
	public AppServices insertUserName() {
		
		
		try {
			
			CommonUtils.insertText("name", read.getObjects().getProperty("subject_field"),"qatrainer",driver);
			
			
			String screenShotPath = capture.capturescreen(driver,"verify valid username");
	        String screen1 = test.addScreenCapture(screenShotPath);
	        test.log(LogStatus.INFO, "Snapshot below: "+screen1);
			
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		
		return this;
		
			
		
	}
	
	
	public AppServices insertInvalidUserName(String un) {
		
		//CommonUtils.insertText("name", read.getObjects().getProperty("subject_field"),"tester",driver);
		CommonUtils.insertText("name", read.getObjects().getProperty("subject_field"), un, driver);
		
		
		return this;
		
		
	}
	
	
	public AppServices insertpassword(String pw) {
		
		try {
			
						
			CommonUtils.insertText("name", read.getObjects().getProperty("password_field"),pw,driver);
			
			String screenShotPath = capture.capturescreen(driver,"verify password");
	        String screen2 = test.addScreenCapture(screenShotPath);
	        test.log(LogStatus.INFO, "Snapshot below: "+screen2);
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
		
		
		return this;
	}
	
	
	public AppServices clicksubmitbutton() {
		
		
	try {
		
		CommonUtils.clickButton("name",read.getObjects().getProperty("login_button"), driver);
		
		String screenShotPath = capture.capturescreen(driver,"verify loginbutton");
        String screen3 = test.addScreenCapture(screenShotPath);
        test.log(LogStatus.INFO, "Snapshot below: "+screen3);
		
		
	}catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
		
		
		
		return this;
	}
	
	
	public AppServices clicksignout() {
		
		
		try {
			
			CommonUtils.clickButton("xpath", read.getObjects().getProperty("signout_button"), driver);
			
			String screenShotPath = capture.capturescreen(driver,"verify signoutbutton");
	        String screen4 = test.addScreenCapture(screenShotPath);
	        test.log(LogStatus.INFO, "Snapshot below: "+screen4);
			
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("Login Fail");
			
		}
		
		
		
		return this;
	}
	
	
	public AppServices clickradiobutton() {
		
		CommonUtils.clickradiobutton("name", read.getObjects().getProperty("firstradiobutton"), driver);
		
		return this;
	}
	
	
	public AppServices clickcheckbox() {
		
		CommonUtils.clickcheckbox("name", read.getObjects().getProperty("marketingcheckbox"), driver);
		
		return this;
	}
	
	
	public AppServices close() {
		
		
		closeBrowser();
		System.out.println("Closing browser");
		test.log(LogStatus.INFO, "closing browser");
		
		extent.flush();
		
		return this;
		
	}
	
	
}
