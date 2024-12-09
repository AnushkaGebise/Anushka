package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3"); Thread.sleep(1000);
        driver.manage().window().maximize();
        WebElement ele=driver.findElement(By.id("browserButton2"));
        ele.click();
        Set<String> wins=driver.getWindowHandles();
        ArrayList<String> arr=new ArrayList<String>(wins);
        int count=arr.size();
        for(int i=0;i<count;i++)
        {
        	String win=arr.get(i);
        	driver.switchTo().window(win);
        	String title=driver.getTitle();
    	    System.out.println(title);
    	    Thread.sleep(1000);
    	    driver.close();
        }
        
        driver.quit();
	}

}
