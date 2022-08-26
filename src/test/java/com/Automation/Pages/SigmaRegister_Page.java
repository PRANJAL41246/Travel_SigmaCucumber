package com.Automation.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigmaRegister_Page extends BasePage{
	@FindBy(xpath = "//a[text()='Signup']")
	private WebElement Click_signup;
	@FindBy(xpath = "//input[@id='icon_prefix']")
	private WebElement name;
	@FindBy(xpath = "//input[@id='icon_email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='icon_address']")
	private WebElement address;
	@FindBy(xpath = "//input[@id='icon_telephone']")
	private WebElement telephone;
	@FindBy(xpath = "//button[text()='CONTINUE' and @data-validator='validateStepOne']")
	private WebElement click;

	// step2
	@FindBy(xpath = "//span[text()='26 to 55']")
	private WebElement CB1;
	@FindBy(xpath = "//md-radio-button[@value='apple']")

	private WebElement CB2;
	@FindBy(xpath = "//label[text()='Male']")
	private WebElement CB3;
	@FindBy(xpath = "//input[@id='studying']")
	private WebElement CB4;
	@FindBy(xpath = "/html/body/div[1]/div/div/div/form/ul/li[2]/div[2]/div[1]/div[2]/div[1]/div/md-checkbox[1]")
	private WebElement CB5;
	@FindBy(xpath = "//span[text()='cricket']")
	private WebElement CB6;
	@FindBy(xpath = "//label[text()='Job']")
	private WebElement CB7;
	@FindBy(xpath = "//input[@value='java']")
	private WebElement CB8;
	@FindBy(xpath = "//input[@value='communication']")
	private WebElement CB9;
	@FindBy(xpath = "/html/body/div[1]/div/div/div/form/ul/li[2]/div[2]/div[2]/button[1]")
	private WebElement click1;

	public void Step1(String n, String e, String a, String t) {
		Click_signup.click();
		name.sendKeys(n);
		email.sendKeys(e);
		address.sendKeys(t);
		telephone.sendKeys(t);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", click);

	}

	public void Step2() {
		CB1.click();
		CB2.click();
		CB3.click();
		CB4.click();
		CB5.click();
		CB6.click();
		CB7.click();
		CB8.click();
		CB9.click();
		click1.click();
	}
}
