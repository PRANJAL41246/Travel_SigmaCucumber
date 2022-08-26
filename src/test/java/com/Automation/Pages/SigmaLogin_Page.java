package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigmaLogin_Page extends BasePage{
	@FindBy(xpath = "//a[@href='login']") private WebElement ClickLogin;
	@FindBy(xpath = "//input[@id='username']") private WebElement enter_Username;
	
	@FindBy(xpath = "//input[@type='password']") private WebElement enter_password;
	@FindBy(xpath = "//button[@class='btn']") private WebElement Click_Login;

 /* public void Submit_login(String username, String password) {
	ClickLogin.click();
	enter_Username.sendKeys(username);	
	enter_password.sendKeys(password);
	Click_Login.click();
} */

public void ClickLogin() {
	ClickLogin.click();
	
}

public void enterUsername(String property) {
	enter_Username.sendKeys(property);
	
}

public void enterPassword(String property) {
	enter_password.sendKeys(property);
	
}

public void clickbtnLogin() {
	Click_Login.click();
	
}
}
