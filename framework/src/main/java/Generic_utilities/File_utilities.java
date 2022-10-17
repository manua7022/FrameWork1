package Generic_utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class File_utilities 
/***
 * *This method is used to launch the application
 * @return
 * @param Key
 * @throws Throwable
 * @author Manuja
 * @return 
 */
{

	public  String getPropertyKeyValue(String Key)throws Throwable 
	{
	//FileInputStream fis=new FileInputStream("./common_data.properties.txt");
		FileInputStream fis=new FileInputStream(ipathConstant.PROPERTYFILE_PATH);
	Properties pro=new Properties();
	pro.load(fis);
	String value=pro.getProperty(Key);
    return value;
	}
}
