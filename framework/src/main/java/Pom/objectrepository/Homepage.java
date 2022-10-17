package Pom.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_utilities.Webdriver_utilities;

public class Homepage
{
	//initialization
		public Homepage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//declaration
		@FindBy(xpath=("//a[.='Organizations']"))
		private WebElement organisationlink;
		
		@FindBy(name="Campaigns")
		private WebElement campaignlink;
		
		@FindBy(xpath=("//a[.='Products']"))
		private WebElement productlink;
		
		@FindBy(xpath=("//img[@src='themes/softed/images/user.PNG']"))
		private WebElement adminlink;
		
		@FindBy(xpath=("//img[@style='padding-left:5px']"))
		private WebElement morelink;
		
		@FindBy(xpath=("//a[.='Sign Out']"))
		private WebElement signoutlink;
		
		//business logic for organisation
		
	   
		public WebElement getOrganisationlink() {
			return organisationlink;
		}
	
		public WebElement getCampaignlink() {
			return campaignlink;
		}
		public WebElement getProductlink() {
			return productlink;
		}
		public WebElement getAdminlink() {
			return adminlink;
		}
		public WebElement getSignoutlink() {
			return signoutlink;
		}
	    public WebElement getMorelink() {
	    return morelink;
        }
		//business logic for campaign
	    public void  organisationlink()
	    {
	    	organisationlink.click();
	    }
	    public void  campaignlink()
	    {
	    	campaignlink.click();
	    }
	    
	    public void productlink()
	    {
	    	productlink.click();
	    }
	    
	    public void adminlink()
	    {
	    	adminlink.click();
	    }
	    public void signoutlink()
	    {
	    	signoutlink.click();
	    }
	    public void morebutton(WebDriver driver)
	    {
	    	Webdriver_utilities  wlib=new Webdriver_utilities();
	    	wlib.mouseOverAction(driver, morelink);
	 
	    }
			
		}
     
 
























