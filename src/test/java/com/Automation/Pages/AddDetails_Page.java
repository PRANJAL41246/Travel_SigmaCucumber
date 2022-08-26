package com.Automation.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddDetails_Page extends BasePage{
	@FindBy(xpath="//a[text()='+ ADD ADULT']") private WebElement addadult;
	@FindBy(xpath="/html/body/div/div/div/div/div[1]/form/div[3]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/input") private WebElement firstname;
	@FindBy(xpath="/html/body/div/div/div/div/div[1]/form/div[3]/div/div/div/div[2]/div[2]/div/div[2]/div[2]/div/input") private WebElement lastname;
	@FindBy(xpath="//span[text()='Male']") private WebElement gender;
	@FindBy(xpath="//input[@placeholder='Mobile No']") private WebElement mobileno;
	@FindBy(xpath="//input[@placeholder='Email']") private WebElement email;
	@FindBy(xpath="//a[text()='Continue']") private WebElement click;
	@FindBy(xpath = "//a[@href='payment']") WebElement OK;
	
	
	
	public void adddetails(String name, String lname, String m, String e) {
		//addadult.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addadult);
		firstname.sendKeys(name);
		lastname.sendKeys(lname);
		gender.click();
		mobileno.sendKeys(m);
		email.sendKeys(e);
		click.click();
		OK.click();
	}


}
