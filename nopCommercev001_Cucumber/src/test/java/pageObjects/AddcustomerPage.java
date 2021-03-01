package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddcustomerPage {

	public WebDriver Idriver;
	public AddcustomerPage(WebDriver rdriver)
	{
		
	
	Idriver=rdriver;
	PageFactory.initElements(Idriver, this);
		
}
	
	
	By lnkCustomers_menu=By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
    By lnkCustomers_menuitem=By.xpath("//a[@href='/Admin/Customer/List']");
    
    
    By btnAddnew=By.xpath("//a[@href='/Admin/Customer/Create']");
    
 
    By txtEmail=By.xpath("//input[@id='Email']");
    By txtPassword=By.xpath("//input[@id='Password']");

    By txtcustomerRoles=By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
  //div[@class='k-multiselect-wrap k-floatwrap']//preceding::input[16]

    By lstitemAdministrators=By.xpath("//li[contains(text(),'Administrators')]");
    By lstitemRegistered=By.xpath("//li[contains(text(),'Registered')]");
    By lstitemGuests=By.xpath("//li[contains(text(),'Guests')]");
    By lstitemVendors=By.xpath("//li[contains(text(),'Vendors')]");

   // By Newsletter=By.xpath("//li[contains(text(),'Vendors')]");
    
    By drpmgrOfVendor=By.xpath("//*[@id='VendorId']");
    By rdMaleGender=By.id("Gender_Male");
    By rdFeMaleGender=By.id("Gender_Female");

    By txtFirstName=By.xpath("//input[@id='FirstName']");
    By txtLastName=By.xpath("//input[@id='LastName']");

    By txtDob=By.xpath("//input[@id='DateOfBirth']");

    By txtCompanyName=By.xpath("//input[@id='Company']");

    By txtAdminContent=By.xpath("//textarea[@id='AdminComment']");

    By btnSave=By.xpath("//button[@name='save']");
    


//action methods
    
    
    public String getPageTitle()
    {
		return Idriver.getTitle();
    	
    }
    
    
public void clickOnlnkCustomersMenu() {
	Idriver.findElement(lnkCustomers_menu).click();
}
public void clickOnCustomersMenuItem() {
	Idriver.findElement(lnkCustomers_menuitem).click();
}


public void clickOnAddnew() {
	Idriver.findElement(btnAddnew).click();
}

public void setEmail(String email)
{
	Idriver.findElement(txtEmail).sendKeys(email);
}

public void setPassword(String password)
{
	Idriver.findElement(txtPassword).sendKeys(password);
}
public void setCustomerRoles(String role) throws InterruptedException
{
	if(!role.equals("Vendors"))
	{
		Idriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]")).click();
    }
	Idriver.findElement(txtcustomerRoles).click();	
    WebElement listitem;
    Thread.sleep(3000);
    if(role.equals("Administrators"))
    {
        listitem=Idriver.findElement(lstitemAdministrators);
    }
    else if(role.equals("Guests"))
    {
        listitem=Idriver.findElement(lstitemGuests);
    }
    else if(role.equals("Registered"))
    {
        listitem=Idriver.findElement(lstitemRegistered);
    }
    else if(role.equals("Vendors"))
    {
        listitem=Idriver.findElement(lstitemVendors);
    }
    else
    {
        listitem=Idriver.findElement(lstitemGuests);
    }

    //listitem.click();
    //Thread.sleep(3000);

    JavascriptExecutor js = (JavascriptExecutor)Idriver;
    js.executeScript("arguments[0].click();", listitem);

}

public void setManagerOfVendor(String value)
{
	Select drp=new Select(Idriver.findElement(drpmgrOfVendor));
	drp.selectByVisibleText(value);

}

	public void selectGender(String gender)
	{
		if(gender.equals("Male"))
		{
			Idriver.findElement(rdMaleGender).click();	
	}
		
		else if(gender.equals("Male"))
			{
				Idriver.findElement(rdMaleGender).click();	
		}
		else {
			Idriver.findElement(rdMaleGender).click();	
		}}
	
		public void setFirstName(String fname)
	    {
			Idriver.findElement(txtFirstName).sendKeys(fname);
	    }
	
	    public void setLastName(String lname)
	    {
	    	Idriver.findElement(txtLastName).sendKeys(lname);
	    }

	    public void setDob(String dob)
	    {
	    	Idriver.findElement(txtDob).sendKeys(dob);
	    }

	    public void setCompanyName(String comname)
	    {
	    	Idriver.findElement(txtCompanyName).sendKeys(comname);
	    }

	    public void setAdminContent(String content)
	    {
	    	Idriver.findElement(txtAdminContent).sendKeys(content);
	    }

	    public void clickOnSave()
	    {
	    	Idriver.findElement(btnSave).click();
	    }
}

