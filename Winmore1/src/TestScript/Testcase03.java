package TestScript;

import org.testng.annotations.Test;

public class Testcase03 extends GenericScript
{

	@Test
	public void title()
	{
		System.out.println(driver.getTitle());
	}
}
