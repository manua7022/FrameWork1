package practise;

import java.io.FileInputStream;
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
import org.openqa.selenium.firefox.FirefoxDriver;

public class Contact 
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	    FileInputStream fis=new FileInputStream("./common_data.properties.txt");
	     Properties pro=new Properties();
	     pro.load(fis);
	     String URL=pro.getProperty("url");
	     String 	UserName=pro.getProperty("un");
	     String PassWord=pro.getProperty("pw");
	     
	     driver.get(URL);
	     driver.findElement(By.name("user_name")).sendKeys(UserName);
	     driver.findElement(By.name("user_password")).sendKeys(PassWord);
	     driver.findElement(By.id("submitButton")).click();
	     driver.findElement(By.xpath("//a[.='Contacts']")).click();
	     
	     driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	     
	     Random ran=new Random();
			int RanNum=ran.nextInt(1000);
			FileInputStream fis1=new FileInputStream("./Excel.xlsx");
			Workbook book=WorkbookFactory.create(fis1);
			Sheet sh=book.getSheet("Sheet1");
			Row row=sh.getRow(0);
			Cell cel=row.getCell(0);
			String data=cel.getStringCellValue()+RanNum;
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys(data);
	     driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	}

}
