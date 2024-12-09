package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase01 extends Facebook {

	@Test
	public void usn()
	{
	 WebElement	usn=driver.findElement(By.id("email"));
	 WebElement pwd=driver.findElement(By.id("pass"));
	 usn.sendKeys("Anushka");
	 pwd.sendKeys("AnushkaG@17");
	 
	}
}
