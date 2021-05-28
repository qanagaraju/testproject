package com.Project.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Objectrep {
	
	public Properties prop =null;
	
	public Properties getObjects() {
		
		try {
			FileInputStream fis = new FileInputStream("./appFiles/objects.properties");
			prop=new Properties();
			prop.load(fis);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return prop;
		
	}
	
	public String getelmentxpath() {
		return prop.getProperty("elementxpath");
	}
	
	
	public String getChromePath() {
		 return prop.getProperty("chromepath");
	}
	
	
	public String getBrowsername() {
		return prop.getProperty("Browser");
	}
	
	
	public String getSampleformLink() {
		return prop.getProperty("mycontactform_samplelink");
	}

}
