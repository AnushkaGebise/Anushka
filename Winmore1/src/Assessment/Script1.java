package Assessment;




import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;





public class Script1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.busonlineticket.com/booking/bus-tickets.aspx");
        driver.manage().window().maximize();
        WebElement org =driver.findElement(By.id("txtOriginGeneral"));
        org.click();
        driver.findElement(By.xpath("(//div[@class='select2-result-label'])[4]")).click();
        
        WebElement dest=driver.findElement(By.id("txtDestinationGeneral"));
        dest.click();
        driver.findElement(By.xpath("(//div[@class='select2-result-label'])[3]")).click();
        
        WebElement date1=driver.findElement(By.id("txtDepartDateBooking"));
        date1.click();
        Thread.sleep(1000);
        WebElement date=driver.findElement(By.xpath("//a[.='20']"));
        date.click();
        Thread.sleep(1000);
        WebElement button=driver.findElement(By.id("btnBusSearchNewGeneral"));
        button.click();
        
       WebElement sel=driver.findElement(By.xpath("(//button[.='SELECT'])[1]"));
       sel.click();
       Thread.sleep(3000);
       WebElement seat1=driver.findElement(By.xpath("(//small[.='3'])[2]"));
       seat1.click();
       WebElement seat2=driver.findElement(By.xpath("(//small[.='2'])[2]"));
       seat2.click();
       WebElement seat3=driver.findElement(By.xpath("(//small[.='12'])[2]"));
       seat3.click();
       WebElement seat4=driver.findElement(By.xpath("(//small[.='11'])[2]"));
       seat4.click();
	}
	
}
