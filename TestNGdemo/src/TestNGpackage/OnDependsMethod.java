package TestNGpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OnDependsMethod {
	@Test
	
	void OpenBrowser()
	{
		System.out.println("Open Browser");
		Assert.assertEquals(5, 5);
	}
	//@Test(dependsOnMethods="OpenBrowser")
	@Test(dependsOnMethods = { "OpenBrowser" })
	void EnterURL()
	
	{
		System.out.println("EnterURL");
	}
	@Test(dependsOnMethods="EnterURL")
	void business()
	{
		System.out.println("Business Application");
	}
	@Test(dependsOnMethods="business")
	void logout()
	{
		System.out.println("Logout");
	}

}


