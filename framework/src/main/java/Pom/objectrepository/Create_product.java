package Pom.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_product
{
	//initialization
			public Create_product(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
	//declaration
			@FindBy(xpath=("//img[@alt='Create Product...']"))
			private WebElement creatproduct;
			@FindBy(name="productname")
			private WebElement producttextfield;
			
            @FindBy(xpath=("//input[@title='Save [Alt+S]']"))
        	private WebElement productsavebutton;
            
            public WebElement getcreatproduct() {
            	return creatproduct;
            }

			public WebElement getProducttextfield() {
				return producttextfield;
			}

			public WebElement getProductsavebutton() {
				return productsavebutton;
			}
            public void producttextfield(String data)
            {
            producttextfield.sendKeys(data);
           }
            public void productsavebutton()
            {
            	productsavebutton.click();
           }
            public void creatproduct()
            {
            	creatproduct.click();
           }
}