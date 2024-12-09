package TestNG;






import org.testng.Assert;
import org.testng.annotations.Test;

public class Script04 {

	@Test
	public void signup()
	{
	   // Reporter.log("signup is successfull",true);
		System.out.println("signup is successfull");
	}
@Test(dependsOnMethods = "signup")
public void login()
{
	//Reporter.log("login is successfull",true);
	System.out.println("login is successfull");
}
@Test(dependsOnMethods = "login")
public void homepage()
{
	 Assert.fail();
	//Reporter.log("homepage is successfull",true);
	System.out.println("homepage is successfull");
}
@Test(dependsOnMethods = "homepage")
public void logout()
{
	//Reporter.log("logout is successfull",true);
	System.out.println("logout is successfull");
}
}
