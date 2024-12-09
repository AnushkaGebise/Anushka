package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example {
    public static void main(String[]agrs) 
	 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
     Thread.sleep(2000);
     WebElement	usn=driver.findElement(By.id("email"));
	 WebElement pwd=driver.findElement(By.id("pass"));
	 usn.sendKeys("Admin");
	 pwd.sendKeys("Admin@123");
	 Thread.sleep(2000);
	 WebElement	usn1=driver.findElement(By.id("email"));
	 WebElement pwd1=driver.findElement(By.id("pass"));
	 usn.sendKeys("Admin1");
	 pwd.sendKeys("Admin1@123");
}
}
