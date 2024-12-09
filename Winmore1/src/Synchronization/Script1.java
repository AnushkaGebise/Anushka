package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
      // Thread.sleep(2000);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebElement ele=driver.findElement(By.xpath("//button[.='Prompt Alert Box']"));
       ele.click();
       Alert popup=driver.switchTo().alert();
       popup.sendKeys("yes");
      String msg=popup.getText();
      System.out.println(msg);
      driver.quit();
       
       
       
       
	}

}
