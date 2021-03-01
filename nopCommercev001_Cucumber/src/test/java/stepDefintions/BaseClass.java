package stepDefintions;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchcustomerPage;

public class BaseClass {
	
	
	
	public WebDriver driver;
	public LoginPage lp;
	
	
	public AddcustomerPage addcust;
	public SearchcustomerPage Searchcustomer;
	public static Logger logger;
	public Properties configProp;
	public static String randomstring()
	{
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		return(generatedString1);
	}

}
