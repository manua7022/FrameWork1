package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider 
{
	@Test(dataProvider="dataprovider1")
	public void userDetails(String name,String name1,String num)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//img[@style='padding-left:5px']")).click();
		driver.findElement(By.name("Campaigns")).click();
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		
		driver.findElement(By.name("campaignname")).sendKeys(name);
		driver.findElement(By.xpath("input[@id='sponsor']")).sendKeys(name1);
		driver.findElement(By.xpath("input[@id='targetsize']")).sendKeys(num);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		driver.quit();
	}

@DataProvider
public Object[][] dataprovider1()
{
	Object[][] data1=new Object[3][3];
	
	data1[0][0]="dell";
	data1[0][1]="window8";
	data1[0][2]="123";
	
	
	data1[0][0]="sony";
	data1[0][1]="window10";
	data1[0][2]="1234";
	
	
	
	data1[0][0]="hp";
	data1[0][1]="window11";
	data1[0][2]="12345";
	return data1;	
}
}
