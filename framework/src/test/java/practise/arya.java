package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class arya {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     
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
	     driver.findElement(By.xpath("//a[.='Organizations']")).click();
	     driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	     
	     
	     
	     
	}

}
