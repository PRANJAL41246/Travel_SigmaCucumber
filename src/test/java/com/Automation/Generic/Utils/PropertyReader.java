package com.Automation.Generic.Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
static Properties prop = new Properties();
	
	public static void initProperty() 
	{
		try {
			prop.load(new FileInputStream("C:\\Users\\pranjal.kumar\\eclipse-workspace\\Travel_SigmaCucumber\\src\\test\\resources\\config\\RegisterLoginSigma.txt"));
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static String getProperty(String key)
		{
			return prop.getProperty(key);
		}

}
