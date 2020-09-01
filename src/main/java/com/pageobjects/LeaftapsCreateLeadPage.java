package com.pageobjects;

import com.webdriverlibrarybase.SeleniumBase;

public class LeaftapsCreateLeadPage extends SeleniumBase{
	
	
	public LeaftapsCreateLeadPage enterCompanyName(String cName) {
		enterText(locateElement("id", "createLeadForm_companyName"),cName);
		return this;
	}
	
	public LeaftapsCreateLeadPage enterFisrtName(String fName) {
		enterText(locateElement("id", "createLeadForm_firstName"),fName);
		return this;
	}
	
	public LeaftapsCreateLeadPage enterLastName(String lName) {
		enterText(locateElement("id", "createLeadForm_lastName"),lName);
		return this;
	}
	
	public LeaftapsCreateLeadPage enterEmail(String email) {
		enterText(locateElement("xpath", "//span[text()='E-Mail Address']/following::input[1]"),email);
		return this;
	}
	
	public LeaftapsCreateLeadPage selectIndustry(String value)
	{
		selectDropdown(locateElement("id","createLeadForm_industryEnumId"),value);
		return this;
	}
	
	public LeaftapsCreateLeadPage  createLead()
	{
		clickItem(locateElement("name","submitButton"));
		return this;
	}

}
