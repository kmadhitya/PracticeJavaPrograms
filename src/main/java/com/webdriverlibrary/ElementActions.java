package com.webdriverlibrary;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface ElementActions {
	
	public WebElement locateElement(String locatorType, String value);
	
	public List<WebElement> locateElements(String locatorType, String value);
	
	public void clickItem(WebElement ele);
	
	public void enterText(WebElement ele, String value);
	
	public void clearAndEnterText(WebElement ele, String value);
	
	public String getTextValue(WebElement ele);
	
	public void selectDropdown(WebElement ele, String value);
	

}
