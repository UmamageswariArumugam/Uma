package Myntra_ReportDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AppsMainMethod {
	
	ExtentReports report;
	ExtentTest logs;
	WebDriver dr;
	
	@Test
	public void myTestCases()
	{
		report=new ExtentReports("C:\\seleniumwebdiriver\\Reports\\reports.html");
		logs=report.startTest("Myntra Report heading Page start validation");
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumwebdiriver\\driver\\chromedriver_win32\\chromedriver.exe");
		dr=new ChromeDriver();
		logs.log(LogStatus.PASS, "Application Open Successfully");
		dr.get("http://www.myntra.com");
		Assert.assertEquals(10,20);
		logs.log(LogStatus.PASS, "Application open successfully");
	}
	@AfterMethod
	public void myCodeFailureCase(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String scPath=ReportUtils.screenshot(dr,"My test acse failed");
			String img=logs.addScreenCapture(scPath);
			logs.log(LogStatus.FAIL,"Validation is failed",img);
			
			
		}
		report.endTest(logs);
		report.flush();
		dr.get("C:\\seleniumwebdiriver\\Reports\\reports.html");
		}
	
	

}
