package TestNG;

import org.testng.annotations.Test;

public class Script02 {
 
	@Test(invocationCount = 2)
	public void signup()
	{
		System.out.println("Signup is successfull");
	}
	@Test(invocationCount = 0)
	public void login()
	{
		System.out.println("login is successfull");
	}
	@Test
	public void homepage()
	{
		System.out.println("homepage is successfull");
	}
	
}
