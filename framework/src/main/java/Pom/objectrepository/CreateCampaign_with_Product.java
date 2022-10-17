package Pom.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaign_with_Product 
{
	private static final String data = null;
	public CreateCampaign_with_Product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=("//img[@title='Select']"))
	private WebElement PlusImage;
	
	@FindBy(id="search_txt")
	private WebElement searchtextfield;
	
	@FindBy(name="search")
	private WebElement searchbutton;
	
	@FindBy(xpath=("//input[@class='crmButton small save']"))
	private WebElement SaveButton;
	
	 public WebElement getPlusImage()
	 {
		 return PlusImage;
	 }
	 public WebElement getsearchtextfield()
	 {
		 return searchtextfield;
	 }
	 public WebElement getsearchbutton()
	 {
		 return searchbutton;
	 }
	 public WebElement  getSaveButton()
	 {
		 return  SaveButton;
	 }
	 
	 public void PlusImage()
	 
	 {
		 PlusImage.click();
	 }
	 public void searchtextfield(String data1)
	 {
		 searchtextfield.sendKeys(data1);
	 }
	 public void searchbutton()
	 {
		 searchbutton.click();
	 }
	 public void SaveButton()
	 {
		 SaveButton.click();
	 }

}
