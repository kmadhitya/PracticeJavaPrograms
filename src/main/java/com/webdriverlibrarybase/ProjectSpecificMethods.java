package com.webdriverlibrarybase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.ExcelUtil;

public class ProjectSpecificMethods extends SeleniumBase{
	
	public String excelFileName;
	@DataProvider(name = "createLeadDataProvider")
	public Object[][] data() throws IOException
	{
		return ExcelUtil.excelData(excelFileName);
	}
	
	@BeforeSuite
	public void beforeSuitemethod()
	{
		System.out.println("At BeforeSuite annotation");
	}
	
	@BeforeClass
	public void beforeClassMethod()
	{
		System.out.println("At BeforeClass annotation");
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		System.out.println("At BeforeMethod annotation");
		openAppln("http://leaftaps.com/opentaps");
		
		FileInputStream fis = new FileInputStream("./leaftaps.properties");
		Properties p = new Properties();
		p.load(fis);
		uname = p.getProperty("username");
		pwd = p.getProperty("password");
		
		enterText(locateElement("id", "username"),uname);
		enterText(locateElement("id","password"),pwd);
		clickItem(locateElement("classname","decorativeSubmit"));
	}
	
	@AfterMethod
	public void close()
	{
		System.out.println("At AfterMethod annotation");
		closeAppln();
	}
	
	/*@AfterClass
	public void afterClassMethod()
	{
		System.out.println("At AfterClass annotation");
	}
	
	@AfterSuite
	public void afterSuitemethod()
	{
		System.out.println("At AfterSuite annotation");
	}*/

}
