package Pom.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Delete_Product
{
	public Create_Delete_Product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
     
	@FindBy(xpath=("//input[@name='Delete']"))
	private WebElement Deletproduct;
	
	
    public WebElement getDeletproduct()
    {
    	 return Deletproduct;
    }
    public void Deletproduct()
    {
    	Deletproduct.click();
    }
}
