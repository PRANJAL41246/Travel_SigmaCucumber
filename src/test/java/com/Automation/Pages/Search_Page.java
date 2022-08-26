package com.Automation.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Page extends BasePage {
	@FindBy(xpath="//span[text()='Go to Travel']") private WebElement GO_click;
	@FindBy(xpath="//span[@class='ng-binding' and text()='LA-US']") private WebElement fromclick;
	@FindBy(xpath="//*[@id=\"search-widget\"]/div[2]/div[1]/div[1]/div/a[3]") private WebElement cityclick ;
	@FindBy(xpath="//*[@id=\"arraival_cities\"]/span") private WebElement toclick;
	@FindBy(xpath="//*[@id=\"search-widget\"]/div[2]/div[2]/div[1]/div/a[2]") private WebElement arrivalcity;
	@FindBy(xpath="//label[text()=' Depart ']") private WebElement clickdate;
	@FindBy(xpath="//button[text()='25']") private WebElement dateclick;
	@FindBy(xpath="/html/body/div/div/div[1]/div[2]/div[3]/div[1]/div/div[2]/div[2]/div/button[2]") WebElement ok;
	@FindBy(xpath="//*[@id=\"search-widget\"]/div[2]/div[5]/div[1]/span") private WebElement passangers;
	@FindBy(xpath="//button[text()='DONE']") private WebElement done;
	@FindBy(xpath="//*[@id=\"search-widget\"]/div[2]/button") private WebElement searchclick;
	@FindBy(xpath="//*[@id=\"left-side--wrapper\"]/div/div/div[3]/div[1]/div/div[1]/p/span") private WebElement flightname;
	@FindBy(xpath="//*[@id=\"left-side--wrapper\"]/div/div/div[3]/div[2]/span[1]") private WebElement price;
	@FindBy(xpath="//a[text()='Book Now']") private WebElement BOOKCLICK;
	
	
	
	
	
	
	public void GO_click() {
		GO_click.click();
		
	}






	public void fromclick() {
		fromclick.click();
		
	}






	public void cityclick() {
		cityclick.click();
		
	}






	public void toclick() {
		toclick.click();
	}






	public void arrivalcity() {
		arrivalcity.click();
		
	}






	public void clickdate() {
	clickdate.click();
		
	}






	public void dateclick() {
	dateclick.click();
		
	}






	public void ok() {
		ok.click();
		
	}






	public void passangers() {
		passangers.click();
		
	}






	public void done() {
		done.click();
		
	}






	public void searchclick() {
	 searchclick.click();
		
	}






	public void BOOKCLICK() {
		BOOKCLICK.click();
		
	}
	
	
	/*  public void search_flight() throws InterruptedException {
		GO_click.click();
		Set<String> Handles=driver.getWindowHandles();
		Iterator<String> list = Handles.iterator();
		String Parent = list.next();
		String Child = list.next();
		driver.switchTo().window(Child);
		fromclick.click();
		cityclick.click();
		toclick.click();
		arrivalcity.click();
		
		Thread.sleep(3000);
		clickdate.click();
		dateclick.click();
		Thread.sleep(3000);
		ok.click();
		passangers.click();
		done.click();
		searchclick.click();
		System.out.println("flightname--->"+flightname.getText());
		// System.out.println("price--->"+price.getText());
		BOOKCLICK.click(); */
		
		
	}


