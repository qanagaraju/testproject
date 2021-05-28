package com.TestCases;

import com.Project.Utilities.Objectrep;
import com.app.Utilities.BaseConfiguration;
import com.myApp.utility.CommonUtils;


public class AppSignUp extends BaseConfiguration{
	
	public Objectrep read;
	
public AppSignUp launchbrowser() {
		
		read = new Objectrep();
			
		InvokeBrowser("chrome");
		
		return this;
	}
	
	


public AppSignUp clicksignupbutton() {
	
	
	CommonUtils.clickButton("xpath", read.getObjects().getProperty("signup"), driver);
	
	
	return this;
}



public AppSignUp name() {
	
	CommonUtils.insertText("name", read.getObjects().getProperty("name"), "nagaraju", driver);
	
	
	return this;
}




public AppSignUp enteremailaddress() {
	
	CommonUtils.insertText("name", read.getObjects().getProperty("email"), "nagaraju.qatrainer@gmail.com", driver);
	
	return this;
}


public AppSignUp enterusername() {
	
	CommonUtils.insertText("name", read.getObjects().getProperty("username"), "qatrainer4u", driver);
	
	
	return this;
}




public AppSignUp enterpassword() {
	
	CommonUtils.insertText("name", read.getObjects().getProperty("password"), "admin", driver);
	
	
	return this;
}



public AppSignUp clicksubmitbutton() {
	
	CommonUtils.clickButton("name", read.getObjects().getProperty("submit"), driver);
	
	
	return this;
}


public AppSignUp closetest() {
	
	driver.quit();
	
	return this;
}


}










