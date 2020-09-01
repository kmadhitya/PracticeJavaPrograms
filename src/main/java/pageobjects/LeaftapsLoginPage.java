package pageobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.webdriverlibrarybase.SeleniumBase;

public class LeaftapsLoginPage extends SeleniumBase {
	
	public LeaftapsLoginPage propFileData() throws IOException
	{
		FileInputStream fis = new FileInputStream("./leaftaps.properties");
		Properties p = new Properties();
		p.load(fis);
		uname = p.getProperty("username");
		pwd = p.getProperty("password");
		return this;
	}
	
	
	public LeaftapsLoginPage enterUsername() {
		enterText(locateElement("id", "username"),uname);
		return this;
	}
	
	public LeaftapsLoginPage enterPassword()
	{
		enterText(locateElement("id","password"),pwd);
		return this;
	}
	
	public LeaftapsHomePage login()
	{
		clickItem(locateElement("classname","decorativeSubmit"));
		return new LeaftapsHomePage();
	}

}
