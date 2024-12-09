package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class script03 {
 
	@Test(priority = 0)
	public void signup()
		{
		    Reporter.log("signup is successfull",true);
			//System.out.println("signup is successfull");
		}
	@Test(priority = 1)
	public void login()
	{
		Reporter.log("login is successfull",true);
		//System.out.println("login is successfull");
	}
	@Test(priority = 3)
	public void homepage()
	{
		Reporter.log("homepage is successfull",true);
		//System.out.println("homepage is successfull");
	}
	@Test(priority = 2)
	public void logout()
	{
		Reporter.log("logout is successfull",true);
	//	System.out.println("logout is successfull");
	}
}
