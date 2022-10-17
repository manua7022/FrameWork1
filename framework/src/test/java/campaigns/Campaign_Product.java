package campaigns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic_utilities.Base_class;
import Generic_utilities.Excel_utilities;
import Generic_utilities.File_utilities;
import Generic_utilities.Java_utilities;
import Generic_utilities.Webdriver_utilities;
import Pom.objectrepository.CreateCampaign_with_Product;
import Pom.objectrepository.Create_Campaign;
import Pom.objectrepository.Create_product;
import Pom.objectrepository.Homepage;
import Pom.objectrepository.Logingpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Campaign_Product extends Base_class
{
	@Test (groups= {"regressionTest"})
	public void campaignwithproduct() throws Throwable
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
		}

		Webdriver_utilities wlib=new Webdriver_utilities ();
		wlib.waitForPageToLoad(driver);

		String URL=flib.getPropertyKeyValue("url");
		String UserName=flib.getPropertyKeyValue("un");
		String PassWord=flib.getPropertyKeyValue("pw");

		driver.get(URL);
			driver.findElement(By.name("user_name")).sendKeys(UserName);
		driver.findElement(By.name("user_password")).sendKeys(PassWord);
		driver.findElement(By.id("submitButton")).click();
		Logingpage login=new Logingpage(driver);
		login.login(UserName,PassWord);*/
		Webdriver_utilities wlib=new Webdriver_utilities ();
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
		
        home.getMorelink().click();
        home.getCampaignlink().click();
        
        Java_utilities jlib1=new Java_utilities();
		int ranNum1=jlib1.getRanDomNum();

		Excel_utilities elib1=new  Excel_utilities();
		String data1=elib1.getDataFromExcel("organisation", 0, 0) +ranNum1;

		Create_Campaign create1=new Create_Campaign(driver);
		create1.getCreatecampaign().click();
		create1.campaigntextfield(data1);
		
		//navigate to product
		/*driver.findElement(By.xpath("//img[@title='Select']")).click();
		wlib.swithToWindow1(driver, "Products&action");
		driver.findElement(By.id("search_txt")).sendKeys(data);
		driver.findElement(By.name("search")).click();*/
		
		CreateCampaign_with_Product creat2=new CreateCampaign_with_Product(driver);
		creat2.getPlusImage().click();
		wlib.swithToWindow1(driver, "Products&record");
		creat2.searchtextfield(data);
		creat2.getsearchbutton().click();
		
		driver.findElement(By.xpath("//a[text()='"+data+"']")).click();
		wlib.swithToWindow1(driver, "Products&action");
		creat2.getSaveButton().click();
		/*driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();*/
		home.adminlink();
		home.getSignoutlink().click();
		
	}
	@Test
	public void cwithpmodify()
	{
		System.out.println("created extra method");
	}
}
