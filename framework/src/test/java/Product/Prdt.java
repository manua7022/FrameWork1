package Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_utilities.Base_class;
import Generic_utilities.Excel_utilities;
import Generic_utilities.File_utilities;
import Generic_utilities.Java_utilities;
import Generic_utilities.Webdriver_utilities;
import Pom.objectrepository.Create_product;
import Pom.objectrepository.Homepage;
import Pom.objectrepository.Logingpage;
import Pom.objectrepository.Validation_and_Verification;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Prdt extends Base_class 
{
    @Test(groups= {"regressionTest"})
	public void creatproduct() throws Throwable
	{
		/*System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/

		File_utilities  flib=new File_utilities();
		/*String BROWSER=flib.getPropertyKeyValue("browser");
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
		}*/

		Webdriver_utilities wlib=new Webdriver_utilities ();
		wlib.waitForPageToLoad(driver);

		/*String URL=flib.getPropertyKeyValue("url");
		String UserName=flib.getPropertyKeyValue("un");
		String PassWord=flib.getPropertyKeyValue("pw");

		driver.get(URL);
		/*	driver.findElement(By.name("user_name")).sendKeys(UserName);
		driver.findElement(By.name("user_password")).sendKeys(PassWord);
		driver.findElement(By.id("submitButton")).click();
		Logingpage login=new Logingpage(driver);
		login.login(UserName,PassWord);*/

		Homepage home=new Homepage(driver);
	    home.getProductlink().click();
        
		/*driver.findElement(By.xpath("//a[.='Products']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();*/

		Java_utilities jlib=new Java_utilities();
		int ranNum=jlib.getRanDomNum();

		Excel_utilities elib=new  Excel_utilities();
		String data=elib.getDataFromExcel("organisation", 0, 0) +ranNum;

		Create_product create=new Create_product(driver);
		create.creatproduct();
		create.producttextfield(data);
		create.getProductsavebutton().click();
		
		
		/*driver.findElement(By.name("productname")).sendKeys(data);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();*/
		
	/*	String text=driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
		if(text.contains(data)) 
		{
			System.out.println("testcase pass");
		}
		else
		{
			System.out.println("failed");
		}*/
		
		Validation_and_Verification valid=new Validation_and_Verification (driver);
		valid.productvalidation(driver, data);
		home.adminlink();
		home.getSignoutlink().click();
		/*Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();*/
		driver.close();
	}
		@Test
		public void modify()
		{
			System.out.println("created extra method");
		}
	}