package Generic_utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Pom.objectrepository.Homepage;
import Pom.objectrepository.Logingpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class 
{
	public WebDriver driver;
	//public static WebDriver sDriver;
	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void beforeSuite()
	{
		System.out.println("data base connection");
	}
	@BeforeTest(groups= {"smokeTest","regressionTest"})
	public void beforeTest() throws Throwable
	{
		
		System.out.println("execute in prallel mode");
	}
	//@Parameters("BROWSER")
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	public void beforeClass( ) throws Throwable
	{
		File_utilities  flib=new File_utilities();
	String BROWSER=flib.getPropertyKeyValue("browser");
	
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
	//sDriver=driver;
		System.out.println("launching browser");
	}
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void beforeMethod() throws Throwable
	{
		File_utilities  flib=new File_utilities();
	    String URL=flib.getPropertyKeyValue("url");
		String UserName=flib.getPropertyKeyValue("un");
		String PassWord=flib.getPropertyKeyValue("pw");

		driver.get(URL);
		Logingpage login=new Logingpage(driver);
		login.login(UserName,PassWord);
		System.out.println("login to application");
	}
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void aftermethod()
	{

		System.out.println("log out the application");
	}
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void afterClass()
	{
		System.out.println("close the browser");
	}
	@AfterTest(groups= {"smokeTest","regressionTest"})
	public void aftertest()
	{
		System.out.println("executed successfully");
	}
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void aftersuite()
	{
		System.out.println("data base close");
	}

}















