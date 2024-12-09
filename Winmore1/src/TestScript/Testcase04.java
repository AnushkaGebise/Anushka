package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase04 extends GenericScript {

	@Test
	public void loginbtn()
	{
		WebElement usn=driver.findElement(By.id("email"));
		usn.sendKeys("Anushka");
		WebElement pd=driver.findElement(By.id("pass"));
	    pd.sendKeys("AnushkaG@17");
		driver.findElement(By.xpath("//button[.='Log in']")).click();
	}
}
