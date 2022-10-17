package organization;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_utilities.Base_class;
import Generic_utilities.Excel_utilities;
import Generic_utilities.Java_utilities;
import Generic_utilities.Webdriver_utilities;
import Pom.objectrepository.Create_Organisation;
import Pom.objectrepository.Homepage;
import Pom.objectrepository.Validation_and_Verification;



/***
 * *This method is used to launch the browser
 * @return
 * @param Key
 * @throws Throwable
 * @author Manuja
 * @return 
 */
public class Org extends Base_class
{

	@Test
	//(retryAnalyzer=Generic_utilities.Retrayanalyser.class)
	
	public void creatorganisation() throws Throwable 
	{
		
		/*File_utilities  flib=new File_utilities();
		String BROWSER=flib.getPropertyKeyValue("browser");
		WebDriver driver;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		/*System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		
		Webdriver_utilities wlib=new Webdriver_utilities ();
		wlib.waitForPageToLoad(driver);

		
		/*String URL=flib.getPropertyKeyValue("url");
		String UserName=flib.getPropertyKeyValue("un");
		String PassWord=flib.getPropertyKeyValue("pw");

		driver.get(URL);
		Logingpage login=new Logingpage(driver);
		login.login(UserName,PassWord);*/
		
		/*driver.findElement(By.name("user_name")).sendKeys(UserName);
		driver.findElement(By.name("user_password")).sendKeys(PassWord);
		
		driver.findElement(By.id("submitButton")).click();*/
	
		Homepage home=new Homepage(driver);
		home.getOrganisationlink().click();
		
	
		/*driver.findElement(By.xpath("//a[.='Organizations']")).click();

		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click(); */

		Java_utilities jlib=new Java_utilities();
		int ranNum=jlib.getRanDomNum();
		jlib.getSystemDate();
		

		Excel_utilities elib=new  Excel_utilities();
		String data=elib.getDataFromExcel("organisation", 0, 0) +ranNum;
		Create_Organisation creat=new Create_Organisation(driver);
        creat.getCreatorganisation().click();
		creat.acounttextfield(data);
		//SoftAssert soft=new SoftAssert();
	//	soft.assertEquals("A", "B");
		creat.getSavebutton().click();
		Assert.assertEquals(false, true);

		Validation_and_Verification valid=new Validation_and_Verification (driver);
		valid.organisationvalidation(driver, data);


		/*String text=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(text.contains(data)) 
		{
			System.out.println("testcase pass");
		}
		else
		{
			System.out.println("failed");
		}*/
		home.adminlink();
		home.getSignoutlink().click();
		/*Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();*/
		driver.close();
		//soft.assertAll();
	}
		
	}

