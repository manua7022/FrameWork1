package practise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softasrt
{
	@Test
	public void customerTest()
	{
		System.out.println("step1");
		System.out.println("step2");
	SoftAssert soft=new SoftAssert();
        soft.assertEquals("a","b");
		System.out.println("step3");
		System.out.println("step4");
		soft.assertAll();
	}
	@Test
	public void modifycustomerTest()
	{
		System.out.println("--------");
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
	}
}


