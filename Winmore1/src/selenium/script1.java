package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.flipkart.com");
     driver.manage().window().maximize();
     WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
     search.sendKeys("iphone11");
     search.click();
     WebElement btn=driver.findElement(By.xpath("//button[.='Search Icon']"));
     btn.click();
     WebElement ele=driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[2]"));
     ele.click();
     Thread.sleep(2000);
     Set<String> win=driver.getWindowHandles();
     int count=win.size();
     ArrayList<String> arr=new ArrayList<String>(win);
     for(int i=0;i<count;i++)
     {
    	 if(i==1)
    	 {
    		  String wins=arr.get(i);
    		  Thread.sleep(2000);
    		  driver.switchTo().window(wins);
    	 }
     
    
	}
     Thread.sleep(2000);
     WebElement cart=driver.findElement(By.xpath("//button[@type='button']"));
     Thread.sleep(2000);
     cart.click();
     Thread.sleep(2000);
     
    WebElement txt=driver.findElement(By.xpath("//input[@type='text']"));
     
    txt.sendKeys("901926037");
    
    WebElement btn1=driver.findElement(By.xpath("//span[.='CONTINUE'"));
    Thread.sleep(1000);
    btn1.click();
    driver.close();
	}
}
