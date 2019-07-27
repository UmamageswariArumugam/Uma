package ReadDataFromHtmlTable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopupHandling {
	@Test
	public void AlertPopUp()
	{
	String key="webdriver.chrome.driver";
	String path="C:\\seleniumwebdiriver\\driver\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key, path);
	WebDriver dr=new ChromeDriver();
	dr.manage().window().maximize();	
    dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
    System.out.println(dr.getTitle());
    
    dr.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
    
	//to close the pop up window
    Alert alt=dr.switchTo().alert();
    
    alt.accept();
    dr.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("Welcome");
	
	}
}