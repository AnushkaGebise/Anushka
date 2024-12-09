package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3"); Thread.sleep(1000);
	        driver.manage().window().maximize();
	        WebElement ele=driver.findElement(By.id("browserButton2"));
	        ele.click();
	        Set<String> wins=driver.getWindowHandles();
	       for(String win:wins)
	        {
	    	   System.out.println(win);
	        }
	        
	        driver.quit();
	}

}
