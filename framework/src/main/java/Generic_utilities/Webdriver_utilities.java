package Generic_utilities;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


/***
 * *This class contains reusable actions of application
 * @return
 * @param Key
 * @throws Throwable
 * @author Manuja
 * @return 
 */

/***
 wait for page load before identfying any synchronized element in dom 
 */   
public class Webdriver_utilities 
{
    public void waitForPageToLoad(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
	}
    /***
   After every action it will for next action to perform
    */   
	public void scriptTimeOut(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);         
	}
	/***
	 used to wait for element to be clickable in gui and check for specific element for every mili seconds
	 */     
	public void waitForElementWithCustomTimeOut(WebDriver driver , WebElement element,int pollingTime)     
	{   
		FluentWait wait1=new FluentWait(driver);
	     wait1.pollingEvery(Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.elementToBeClickable(element));
	}
	/***
	 used to switch to any window based on window title 
	 */                                                                                         
	public void swithToWindow1(WebDriver driver , String partialWindowTitle) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String wID = it.next();
			driver.switchTo().window(wID);
			String currentWindowTitle = driver.getTitle();
			if(currentWindowTitle.contains(partialWindowTitle)) {
				break;
			}
		}
	}
	/***
	 used to swicth to AlertWindow and Accept(click on ok Button)                    
	 */
	
	public void swithToAlertAndAccpect(WebDriver driver)
	{
	  driver.switchTo().alert().accept();	
	}
	/***
	 used to swicth to AlertWindow and Dismiss(click on ok cancel Button)               
	 */
	public void swithToAlertAnsDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/***
	 used to swicth to Frame window based on index                                    
	 */
	public void swithToFrame(WebDriver driver , int index) {
		driver.switchTo().frame(index);
	}
	/***
	 used to swicth to Frame window based on id or attribute                          
	 */
	public void switchToFrame(WebDriver driver,String id_name_Attribute)
	{
		driver.switchTo().frame(id_name_Attribute);
	}
	/***
	 used to select the value from the dropdown basedon index
	 */
	public void selectByIndex(WebElement element,int index)
	{                                                                               
		Select S=new Select(element);
		S.selectByIndex(index);
	}
	/***
	 used to select the value from the dropdown basedon index
	 */
	public void selectByIndex(WebElement element,String text)
	{
		Select S1=new Select(element);                                                
		S1.selectByVisibleText(text);
	}
	/***
	 used to place the cursor on specified element
	 */
	public void mouseOverAction(WebDriver driver,WebElement Element)                  
	{
		Actions A=new Actions(driver);
		A.moveToElement(Element).perform();
	}
	
	/***
	 used to right click on specific element
	 */                                                                                  
	public void rightClickOnElement(WebDriver driver , WebElement elemnet)
	{
		Actions act = new Actions(driver);
		act.contextClick(elemnet).perform();
	}

	/***
	 used to right click on specific element
	 */
	public void moveByOffest(WebDriver driver,int x,int y)
	{                                                                                         
		Actions act = new Actions(driver);
		act.moveByOffset(x,y).click().perform();
	}
	
}
