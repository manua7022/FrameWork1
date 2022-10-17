package Pom.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Validation_and_Verification 
{
	public Validation_and_Verification  (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//declaration
	@FindBy(xpath=("//span[@class='dvHeaderText']"))
	private WebElement actualorgData;

	@FindBy(xpath=("//span[@class='lvtHeaderText']"))
	private WebElement productData;

	@FindBy(xpath=("//span[@class='dvHeaderText']"))
	private WebElement compaignData;

	public WebElement getProductData() {
		return productData;
	}
	public WebElement getCompaignData() {
		return compaignData;
	}
	public WebElement getHeadertext() {
		return actualorgData;
	}
	public void organisationvalidation(WebDriver driver,String data)
	{
		String actualData=actualorgData.getText();
		if(actualData.contains(data))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");

		}
	}

	public void productvalidation(WebDriver driver,String data)
	{
		String actualData1=productData.getText();
		if(actualData1.contains(data))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		} 
	}
	public void compaignvalidation(WebDriver driver,String data)
	{
		String actualData2=compaignData.getText();
		if(actualData2.contains(data))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		} 
	}

}


