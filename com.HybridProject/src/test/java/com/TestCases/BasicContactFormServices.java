package com.TestCases;

import com.Project.Utilities.Objectrep;
import com.app.Utilities.BaseConfiguration;
import com.myApp.utility.CommonUtils;

public class BasicContactFormServices extends BaseConfiguration {
	
	
	public static Objectrep read;
	
	
	public BasicContactFormServices browserlaunch() {
		
		read=new Objectrep();
		
		InvokeBrowser("chrome");
		
		return this;
		
	}
	
	
	
	public BasicContactFormServices clicksampleform() throws Exception {
		
		
		CommonUtils.clickweblink("xpath", read.getObjects().getProperty("mysampleform_link"), driver);
		
		return this;
		
	}
	
	
	public BasicContactFormServices clickbasiccontactform() throws Exception {
		
		
		CommonUtils.clickweblink("xpath", read.getObjects().getProperty("basiccontactform_link"), driver);
		
		return this;
		
	}
	
	
	public BasicContactFormServices insertyourname() {
		//yourname
		
		CommonUtils.insertText1("name", read.getObjects().getProperty("yourname"), "nareshiit", driver);
		
		return this;
	}
	
	
	
	public BasicContactFormServices insertmail() {
		//yourname
		
		CommonUtils.insertText1("name", read.getObjects().getProperty("email"), "onlinetraining@nareshiit.com", driver);
		
		return this;
	}
	
	
	public BasicContactFormServices insertsubject() {
		//yourname
		
		CommonUtils.insertText1("name", read.getObjects().getProperty("message"), "java selenium online training", driver);
		
		return this;
	}
	
	
	public BasicContactFormServices clickcontactformsubmit() {
		
		CommonUtils.clickButton("name", read.getObjects().getProperty("contactsubmit"), driver);
		
		return this;
	}
	
	
	

}
