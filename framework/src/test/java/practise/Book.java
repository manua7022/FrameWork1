package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Book {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		FileInputStream fis=new FileInputStream("./Tripp.txt");
		Properties pro=new Properties();
		pro.load(fis);
		String URL=pro.getProperty("url");


		driver.get(URL);


		WebElement ele =   driver.findElement(By.xpath("//span[.='From']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		ele.click();
		FileInputStream fis1=new FileInputStream("./Book2.xlsx");
		Workbook book=WorkbookFactory.create(fis1);
		Sheet sh=book.getSheet("Sheet1");
		Row row=sh.getRow(0);
		Cell cel=row.getCell(0);
		String data=cel.getStringCellValue();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(data);
		driver.findElement(By.xpath("//p[.='Bengaluru, India']")).click();

		driver.findElement(By.xpath("//span[.='To']")).click();

		FileInputStream fis2=new FileInputStream("./Book2.xlsx");
		Workbook book1=WorkbookFactory.create(fis2);
		Sheet sh1=book1.getSheet("Sheet1");
		Row row1=sh1.getRow(0);
		Cell cel1=row1.getCell(1);
		String data1=cel1.getStringCellValue();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(data1);
		driver.findElement(By.xpath("//p[.='Mangalore, India']")).click();
		String month="September 2022";
		String date="30";
	    driver.findElement(By.xpath("//div[text()='"+month+"']"
	    		+"/ancestor::div[@class='DayPicker-Months']/descendant::p[text()='"+date+"']")).click();
	    
	        driver.findElement(By.xpath("//div[@data-cy='returnArea']")).click();
	    
	   
	    String month1="October 2022";
		String date1="1";
	     driver.findElement(By.xpath("//div[text()='"+month1+"']"
	    		+"/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date1+"']")).click();
		 
		   
		 



	}

}
