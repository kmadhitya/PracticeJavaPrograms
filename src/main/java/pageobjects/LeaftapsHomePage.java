package pageobjects;

import com.webdriverlibrarybase.SeleniumBase;

public class LeaftapsHomePage extends SeleniumBase {
	
	public LeaftapsHomePage crmsfa()
	{
		clickItem(locateElement("linktext","CRM/SFA"));
		return this;
	}
	
	public LeaftapsCreateLeadPage createLead()
	{
		clickItem(locateElement("linktext","Create Lead"));
		return new LeaftapsCreateLeadPage();
	}
	

}
