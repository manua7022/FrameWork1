package Pom.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Campaign
{
	//initialization
		public  Create_Campaign(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
            @FindBy(xpath=("//img[@title='Create Campaign...']"))
            private WebElement createcampaign;
            @FindBy(name="campaignname")
            private WebElement campaigntextfield;
            @FindBy(xpath=("//input[@title='Save [Alt+S]']"))
            private WebElement savebutton;
			public WebElement getCreatecampaign() {
				return createcampaign;
			}
			public WebElement getCampaigntextfield() {
				return campaigntextfield;
			}
			public WebElement getSavebutton() {
				return savebutton;
			}
            public void createcampaign()
            {
            	createcampaign.click();
            }
            public void campaigntextfield(String data)
            {
            	campaigntextfield.sendKeys(data);
            }
            public void savebutton()
            {
            	savebutton.click();
            }

}
