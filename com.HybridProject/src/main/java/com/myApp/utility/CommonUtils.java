package com.myApp.utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Project.Utilities.Objectrep;
import com.app.Utilities.BaseConfiguration;
import com.app.Utilities.CaptureScreenshot;



public class CommonUtils extends BaseConfiguration {
	
	public static Objectrep read;
	public static CaptureScreenshot capture = new CaptureScreenshot();
	private static WebElement submitbutton,xpath,submitid,signout,un,checkbox,name,radiobutton,cssselector;
	
	
	
public static void clickweblink(String IdentifiedBy,String locator,WebDriver driver) throws Exception {
		
	
		
		if(IdentifiedBy.equalsIgnoreCase("id")) {
			
			driver.findElement(By.id(locator)).click();
			
		}
		else if(IdentifiedBy.equalsIgnoreCase("name")) {
			
			 name = driver.findElement(By.name(locator));
			 if(name.isEnabled()) {
				 name.click();
				 System.out.println("Link Verified");
					
				}
				else
				{
					System.out.println("Does not verified");
					capture.capturescreen(driver, "Link captured");
				}	
			 
			
		}
		else if(IdentifiedBy.equalsIgnoreCase("xpath")) {
			 xpath = driver.findElement(By.xpath(locator));
			if(xpath.isEnabled()) {
				xpath.click();
				System.out.println("Link Verified");
								
			}
			else
			{
				System.out.println("Does not verified");
			}
		}
		else
		{
			if(IdentifiedBy.equalsIgnoreCase("cssselector")) {
				 cssselector = driver.findElement(By.xpath(locator));
				if(cssselector.isEnabled()) {
					cssselector.click();
					System.out.println("Link Verified");
									
				}
				else
				{
					System.out.println("Does not verified");
				}
			}
		}
		
}
	
	
	public static void clickButton(String IdentifiedBy,String locator,WebDriver driver) {
		
		if(IdentifiedBy.equalsIgnoreCase("id")) {
			 submitid = driver.findElement(By.id(locator));
			if(submitid.isEnabled()) {
				submitid.click();
				
				try {
					String error = driver.findElement(By.id("right_col_top_err")).getText();
					System.out.println(error);
					capture.capturescreen(driver, error);
				}catch(Exception e) {
					System.out.println(e.getMessage());
					
				}
				
				
			}
			
		}
		else if(IdentifiedBy.equalsIgnoreCase("name")) {
			
			//Implemented validation
			submitbutton = driver.findElement(By.name(locator));
			if(submitbutton.isEnabled()) {
				submitbutton.click();
				
				try {
					String error = driver.findElement(By.id("right_col_top_err")).getText();
					System.out.println(error);
				}catch(Exception e) {
					System.out.println(e.getMessage());
					
				}
				
				
			}
		}
		else if(IdentifiedBy.equalsIgnoreCase("xpath")) {
			signout = driver.findElement(By.xpath(locator));
			if(signout.isEnabled()) {
				signout.click();
				System.out.println("Login success");
			}
			else
			{
				System.out.println("Login fail");
			}
			
		}
		else
			if(IdentifiedBy.equalsIgnoreCase("id")) {
				driver.findElement(By.cssSelector(locator)).click();
			}
		
	}
	
	
	
	
	public static void insertText(String IdentifiedBy,String locator,String uname, WebDriver driver ) {
		
		read = new Objectrep();
		
		if(IdentifiedBy.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).sendKeys(uname);
		}
		else if(IdentifiedBy.equalsIgnoreCase("name")) {
			
			
			un = driver.findElement(By.name(locator));
			if(un.isEnabled()) {
				un.sendKeys(uname);
				
				if(uname.equals(read.getObjects().getProperty("username"))) {
					System.out.println("UserName verified");
					String actvalue = driver.findElement(By.name("user")).getText();
					System.out.println(actvalue);
					
				}
				else
				{
					System.out.println("Does not verified");
				}
			}
			
					
			
			
		}
		else if(IdentifiedBy.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).sendKeys(uname);
		}
		else
			if(IdentifiedBy.equalsIgnoreCase("id")) {
				driver.findElement(By.cssSelector(locator)).sendKeys(uname);
			}
	}
	
	
	
public static void insertText1(String IdentifiedBy,String locator,String uname, WebDriver driver ) {
		
		read = new Objectrep();
		
		if(IdentifiedBy.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).sendKeys(uname);
		}
		else if(IdentifiedBy.equalsIgnoreCase("name")) {
			
			
			 driver.findElement(By.name(locator)).sendKeys(uname);;
						
		}
		else if(IdentifiedBy.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).sendKeys(uname);
		}
		else
			if(IdentifiedBy.equalsIgnoreCase("id")) {
				driver.findElement(By.cssSelector(locator)).sendKeys(uname);
			}
	}
	
	
	
	
	
	
	
	public static void clickcheckbox(String IdentifiedBy,String locator, WebDriver driver  ) {
		
		
		if(IdentifiedBy.equals("id")) {
			
			driver.findElement(By.name(locator)).click();
			
		}
		
		else if(IdentifiedBy.equals("name")) {
			
			checkbox=driver.findElement(By.name(locator));
			if(checkbox.isEnabled()) {
				System.out.println("Checkbox available");
				checkbox.click();
			}
			
			
			else
			
				if(checkbox.isSelected()) {
					
					checkbox.click();
					
					
		}
		else 
			
			if(IdentifiedBy.equals("xpath")) {
			
			driver.findElement(By.name(locator)).click();
			
		}
		else if(IdentifiedBy.equals("cssselector")) {
			
			driver.findElement(By.name(locator)).click();
			
		}
			
		
		
	}
	
	}
	
	
	
	
	
public static void clickradiobutton(String IdentifiedBy,String locator, WebDriver driver  ) {
		
		
		if(IdentifiedBy.equals("id")) {
			
			driver.findElement(By.name(locator)).click();
			
		}
		
		else if(IdentifiedBy.equals("name")) {
			
			radiobutton=driver.findElement(By.name(locator));
			if(radiobutton.isEnabled()) {
				System.out.println("radiobutton available");
				radiobutton.click();
			}
			
			
			else
			
				if(radiobutton.isSelected()) {
					
					radiobutton.click();
					
					
		}
		else 
			
			if(IdentifiedBy.equals("xpath")) {
			
			driver.findElement(By.name(locator)).click();
			
		}
		else if(IdentifiedBy.equals("cssselector")) {
			
			driver.findElement(By.name(locator)).click();
			
		}
			
		
		
	}
	
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
	


