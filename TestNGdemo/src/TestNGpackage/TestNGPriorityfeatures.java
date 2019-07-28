package TestNGpackage;

import org.testng.annotations.Test;

public class TestNGPriorityfeatures {
	@Test(priority=1)
	
	void OpenBrowser()
	{
		System.out.println("Open Browser");
	}
	@Test(priority=2)
	void EnterURL()
	
	{
		System.out.println("EnterURL");
	}
	@Test(priority=3)
	void business()
	{
		System.out.println("Business Application");
	}
	@Test(priority=4)
	void logout()
	{
		System.out.println("Logout");
	}

}
