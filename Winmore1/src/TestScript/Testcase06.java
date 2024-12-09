package TestScript;

import org.testng.annotations.Test;

public class Testcase06 extends GenericScript
{

	@Test
	public void pagesource()
	{
		System.out.println(driver.getPageSource());
	}
}
