package practise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertexample
{
	@Test
	public void creatcustomerTest()
	{
		System.out.println("step1");
		System.out.println("step2");
		Assert.assertEquals("a","b");
		System.out.println("step3");
		System.out.println("step4");
	}

	@Test
	public void modifycustomerTest()
	{
		System.out.println("---------------");
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
}
}