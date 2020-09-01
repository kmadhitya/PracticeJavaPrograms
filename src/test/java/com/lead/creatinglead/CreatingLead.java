package com.lead.creatinglead;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webdriverlibrarybase.ProjectSpecificMethods;

import pageobjects.LeaftapsHomePage;
import pageobjects.LeaftapsLoginPage;

public class CreatingLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData()
	{
		System.out.println("At BeforeTest annotation");
		excelFileName = "CreateLeadData2";
	}
	
	
	
	@Test(dataProvider = "createLeadDataProvider", expectedExceptions = RuntimeException.class)
	public void creatingLead(String Company, String FirstName, String LastName, String Email, String Industry){
		System.out.println("At Test annotation");
		new LeaftapsHomePage().crmsfa().createLead().enterCompanyName(Company).enterFisrtName(FirstName)
		.enterLastName(LastName).enterEmail(LastName).selectIndustry(Industry).createLead();
		
		//to show always passed
		throw new RuntimeException();
	
	}

}
