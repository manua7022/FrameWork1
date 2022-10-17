package practise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pomfacebook extends Facebook
{
	@Test
	public void Pomfacebook()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//input[@name='user_name']"))
	private WebElement usernamefield;
	
	@FindBy(xpath=("//input[@type='password']"))
	private WebElement passwordfield;
	
	@FindBy(xpath=("//input[@type='submit']"))
	private WebElement loginbutton;

	public WebElement getUsernamefield() {
		return usernamefield;
	}

	public WebElement getPasswordfield() {
		return passwordfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public void userName(String name)
	{
		usernamefield.sendKeys(name);
	}
	public void password(String word)
	{
		passwordfield.sendKeys(word);
	}
	public void button()
	{
		loginbutton.click();
		}

}
