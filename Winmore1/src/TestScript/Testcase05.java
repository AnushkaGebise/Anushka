package TestScript;

import org.testng.annotations.Test;

public class Testcase05 extends GenericScript 
{

	@Test
	public void url()
	{
	     System.out.println(driver.getCurrentUrl());
	}
}
