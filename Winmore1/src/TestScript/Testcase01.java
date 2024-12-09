package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase01 extends GenericScript
{
  @Test
  public void usn()
  {
	 boolean displayed=driver.findElement(By.id("email")).isDisplayed();
	 boolean enabled=driver.findElement(By.id("email")).isEnabled();
	 WebElement usn=driver.findElement(By.id("email"));
	 usn.sendKeys("Anushka");
	 System.out.println(displayed + " " + enabled);
  }
	
}
