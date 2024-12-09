package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class task1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.selenium.dev/downloads/");
      driver.manage().window().maximize();
      ArrayList<WebElement> wins=new ArrayList<WebElement>();
      wins.add(driver.findElement(By.xpath("(//a[@class='card-link'])[1]")));
      Thread.sleep(2000);
      wins.add(driver.findElement(By.xpath("(//a[@class='card-link'])[4]")));
      Thread.sleep(2000);
      wins.add(driver.findElement(By.xpath("(//a[@class='card-link'])[10]")));
      Thread.sleep(2000);
      wins.add(driver.findElement(By.xpath("(//a[@class='card-link'])[13]")));
      Thread.sleep(2000);
        
      Actions a=new Actions(driver);
      for(WebElement arr:wins)
      {
    	  
       a.contextClick(arr).perform();
       Thread.sleep(2000);
       Robot r=new Robot();
       r.keyPress(KeyEvent.VK_DOWN);
       r.keyRelease(KeyEvent.VK_DOWN);
       Thread.sleep(2000);
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
      
	}
   Thread.sleep(2000);
   Set<String> win=driver.getWindowHandles();
   for(String b:win)
   {
	   driver.switchTo().window(b);
	   Thread.sleep(2000);
	   String title=driver.getTitle();
	   System.out.println(title);
	   driver.close();
   }
}
}