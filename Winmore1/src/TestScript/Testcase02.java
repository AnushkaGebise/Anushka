package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase02 extends GenericScript
{

	@Test
	public void pwd()
	{
     boolean displayed=driver.findElement(By.id("pass")).isDisplayed();
     boolean enabled=driver.findElement(By.id("pass")).isEnabled();
     WebElement pd=driver.findElement(By.id("pass"));
     pd.sendKeys("AnushkaG@17");
	 System.out.println(displayed + " " + enabled);
	}
}
