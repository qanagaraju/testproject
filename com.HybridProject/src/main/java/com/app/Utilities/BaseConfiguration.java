package com.app.Utilities;

import java.io.FileInputStream;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.Project.Utilities.Objectrep;




public abstract class BaseConfiguration extends Objectrep
{
	public Properties prop=null;
	public WebDriver driver=null;
	public FileInputStream fis;
	public ChromeDriver chromedriver;
	
	
	public void InvokeBrowser(String browsername) {
		
		try {
			fis=new FileInputStream("./appFiles/config.properties");
			prop=new Properties();
			prop.load(fis);
			
			//String br = prop.getProperty("Browser");
			if(browsername.equalsIgnoreCase("chrome")) {
				
				/*
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--chrome");
				
				chromedriver = new ChromeDriver(options);
				*/
				
				System.setProperty(prop.getProperty("browsersetup"), prop.getProperty("browserdriver"));
				driver=new ChromeDriver();
				System.out.println("launching driver");
			}
			else if(browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./appDrivers/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if(browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.ie.driver", "./appDrivers/IEdriver.exe");
				driver=new InternetExplorerDriver();
			}
			
			
			driver.get(prop.getProperty("url"));
			
			if(prop.getProperty("url").equals(driver.getCurrentUrl())) {
				System.out.println("URL is verified");
			}
			else
			{
				System.out.println("Does not verified");
			}
			
			
			driver.manage().window().maximize();
			//String imp_wait=prop.getProperty("ImplicitWait");
			//int implicit_wait=Integer.parseInt(imp_wait);
			//driver.manage().timeouts().implicitlyWait(implicit_wait, TimeUnit.SECONDS);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
    
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
}
