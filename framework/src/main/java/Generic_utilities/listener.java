package Generic_utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener
{

	public void onTestFailure(ITestResult result) {
		
		String data=result.getMethod().getMethodName();
		//EventFiringWebDriver edriver = new EventFiringWebDriver(Base_class.sDriver);
	//	File src = edriver.getScreenshotAs(OutputType.FILE);
		try {
			File dsc = new File("./framework/Screenshot"+data+".png");
			//FileUtils.copyFile(src, dsc);
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
  
	
}
