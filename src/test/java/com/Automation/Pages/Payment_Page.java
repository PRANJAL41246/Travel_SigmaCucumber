package com.Automation.Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Automation.Generic.Utils.DriverUtils;

public class Payment_Page extends BasePage {
	@FindBy(xpath = "//a[text()='UPI']") private WebElement upi;
	@FindBy(xpath = "//a[@ng-click='bookFlight();paid=true']") private WebElement finish;
	
	
	public void paymentoption(String path) {
		upi.click();
		finish.click();
		TakesScreenshot t = (TakesScreenshot)DriverUtils.getDriver();
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest =  new File(path);
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
