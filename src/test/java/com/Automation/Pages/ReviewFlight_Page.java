package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewFlight_Page extends BasePage{
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/div/div/div[1]/div/div/p[2]") private WebElement flightname;
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/div/div/div[2]/div[1]/p[2]/span") private WebElement fromcity;
	@FindBy(xpath="//*[@class='arrival-city']//span[text()='Washington, D.C.']") private WebElement tocity;
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/p/span[1]/span") private WebElement price;
	@FindBy(xpath="//span[@ng-bind='total']") private WebElement totalprice;
	@FindBy(xpath="//a[text()='Continue']") private WebElement click; 
	
	

 public void flightdetails() {
	 System.out.println("flightname--->"+flightname.getText());
	 System.out.println("fromcity--->"+fromcity.getText());
	 System.out.println("tocity---"+tocity.getText());
	 System.out.println("price---"+price.getText());
	 System.out.println("totalprice--->"+totalprice.getText());
	 click.click();
	 
 }

}
