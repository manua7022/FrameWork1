package Generic_utilities;

import java.util.Date;
import java.util.Random;
/***
 * *This method is used to launch the application
 * @return
 * @param Key
 * @throws Throwable
 * @author Manuja
 * @return 
 */

public class Java_utilities 
{
	public int getRanDomNum()
	{
		Random ran =new Random();
		int RanNum=ran.nextInt(1000);
		return RanNum;
	}
	public String  getSystemDate() {
		Date date = new Date();
		String currentDate = date.toString();
		System.out.println(currentDate);
		String[] arr = currentDate.split(" ");
		
		String yyyy = arr[5];
		String dd = arr[2];
		int mm = date.getMonth()+1;
	
			String formate = yyyy+"-"+mm+"-"+dd;
			return formate;
	}


}
