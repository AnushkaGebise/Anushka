package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript {

	
	WebDriver driver;
	@BeforeMethod
	public void Browser()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
