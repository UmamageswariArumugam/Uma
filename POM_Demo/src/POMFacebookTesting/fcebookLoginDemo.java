package POMFacebookTesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class fcebookLoginDemo {
	
	String key="webdriver.chrome.driver";
	String path="C:\\seleniumwebdiriver\\driver\\chromedriver_win32\\chromedriver.exe";
	WebDriver dr;
	By un=By.xpath("//input[@id='email']");
	By pass=By.xpath("//input[@id='pass']");
	By login=By.xpath("//input[@id='u_0_a']");
	@BeforeMethod
	public void OpenBrowser()
	{
		System.setProperty(key, path);
	    dr=new ChromeDriver();
		dr.manage().window().maximize();
	    dr.get("https://www.facebook.com");
		
	}
	@Test(dataProvider="dp")
	public void LoginPageFunct(String uname,String password)
	{	
    dr.findElement(un).sendKeys(uname);
    dr.findElement(pass).sendKeys(password);
    dr.findElement(login).click();
	}
	@AfterMethod
	public void CloseBrowser()
	{
		dr.close();
	}
	
    @DataProvider(name="dp")
	public Object[][] ReadInputData() throws JXLException, Exception
	{
	 File inputF = new File("C:\\seleniumwebdiriver\\inputdata\\sedata.xls");
	 Workbook wb=Workbook.getWorkbook(inputF);
	 Sheet wsheet=wb.getSheet(0);//we.getSheet("Sheet1");
	 int rc=wsheet.getRows();
	 int cc=wsheet.getColumns();
	 
	 String[][] inputdata=new String[rc][cc];
	 
	 for(int i=0;i<rc;i++)
	 {
		 for(int j=0;j<cc;j++)
				 {
			 
			      Cell cval=wsheet.getCell(j,i);
			      inputdata[i][j]=cval.getContents();
				 }
			 	 
			}
	    return inputdata;
	 }
	 
	}
	

