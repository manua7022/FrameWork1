package Pom.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Organisation 
{
	//initialization
		public  Create_Organisation(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//declaration
		@FindBy(xpath=("//img[@title='Create Organization...']"))
		private WebElement creatorganisation;
		
		@FindBy(name="accountname")
		private WebElement acounttextfield;
		
		@FindBy(xpath=("//input[@title='Save [Alt+S]']"))
		private WebElement savebutton;
		
		@FindBy(xpath=("//span[@class='dvHeaderText']"))
		private WebElement text;

		public WebElement getCreatorganisation() {
			return creatorganisation;
		}

		public WebElement getAcounttextfield() {
			return acounttextfield;
		}

		public WebElement getSavebutton() {
			return savebutton;
		}

		public WebElement getText() {
			return text;
		}
		
		 public void creatorganisation()
		    {
			 creatorganisation.click();
		    }
		 public void acounttextfield(String data)
		    {
			 acounttextfield.sendKeys(data);
		    }
		 public void savebutton()
		    {
			 savebutton.click();
		    }
		
		 public void text()
		    {
			 text.getText();
		    }
}
