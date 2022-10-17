package Pom.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logingpage
{
	//initialization
	public Logingpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//declaration
	@FindBy(name="user_name")
	private WebElement usernametextfield;
	
	@FindBy(name="user_password")
	private WebElement passwordtextfield;
	
	@FindBy(id="submitButton")
	private WebElement sumbitbtn;
	
	public WebElement getUsernametextfield() {
		return usernametextfield;
	}
	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}
	public WebElement getSumbitbtn() {
		return sumbitbtn;
	}
	public void login(String userName , String password)
	{
		usernametextfield.sendKeys(userName);
		passwordtextfield.sendKeys(password);
		sumbitbtn.click();
		
	}
   }

