package com.webdriverlibrarybase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webdriverlibrary.BrowserActions;
import com.webdriverlibrary.ElementActions;

public class SeleniumBase implements BrowserActions, ElementActions{

	public static RemoteWebDriver driver;
	public static WebDriverWait wait;
	public String excelFileName;
	public String uname;
	public String pwd;
	@Override
	public void openAppln(String url) {
		try {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(Exception e){
			System.out.println("Something wrong while luanching the appln");
		}
		
	}

	@Override
	public void closeAppln() {
		driver.close();
		
	}

	@Override
	public WebElement locateElement(String locatorType, String value) {
		try
		{
			switch (locatorType.toLowerCase())
			{
			case "id":
			return driver.findElementById(value);
			case "name":
			return driver.findElementByName(value);
			case "classname":
			return driver.findElementByClassName(value);
			case "linktext":
			return driver.findElementByLinkText(value);
			case "xpath":
			return driver.findElementByXPath(value);
			}
		}
		catch(Exception e)
		{
			System.out.println("Something wrong with locators");
		}
		return null;
	}
	@Override
	public List<WebElement> locateElements(String locatorType, String value)
	{
		try
		{
			switch (locatorType.toLowerCase())
			{
			case "id":
			return driver.findElementsById(value);
			case "name":
			return driver.findElementsByName(value);
			case "classname":
			return driver.findElementsByClassName(value);
			case "linktext":
			return driver.findElementsByLinkText(value);
			case "xpath":
			return driver.findElementsByXPath(value);
			}
		}
		catch(Exception e)
		{
			System.out.println("Something wrong with locators");
		}
		return null;
	}

	@Override
	public void clickItem(WebElement ele) {
		try
		{
			ele.click();
		}
		catch(Exception e)
		{
			System.out.println("Element could not be clicked");
		}
	}

	@Override
	public void enterText(WebElement ele, String value) {
		try
		{
			ele.sendKeys(value);
		}
		catch(Exception e)
		{
			System.out.println("Text could not be entered");
		}
	}

	@Override
	public void clearAndEnterText(WebElement ele, String value) {
		try
		{
			ele.clear();
			ele.sendKeys(value);
		}
		catch(Exception e)
		{
			System.out.println("Text could not be entered");
		}
		
	}

	@Override
	public String getTextValue(WebElement ele) {
		String text="";
		try
		{
			text = ele.getText();
		}
		catch(Exception e)
		{
			System.out.println("Unable to get the text");
		}
		return text;
	}
	
	@Override
	public void selectDropdown(WebElement ele, String value)
	{
		try
		{
			Select dd = new Select(ele);
			dd.selectByVisibleText(value);
		}
		catch(Exception e)
		{
			System.out.println("Unable to select the dropdown value");
		}
	}

}
