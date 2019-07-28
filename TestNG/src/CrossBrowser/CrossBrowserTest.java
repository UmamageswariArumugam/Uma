package CrossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver dr;
	@Parameters("browser")
	@Test
	public void BrowserTest(String browsername)
	{
		//select browser name by using xml params
		if(browsername.equalsIgnoreCase("glc"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\seleniumwebdiriver\\driver\\chromedriver_win32\\chromedriver.exe");
			dr=new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("ff"))
			
		{
			System.setProperty("webdriver.gecko.driver", "C:\\seleniumwebdiriver\\driver\\MozillaFirefoxDriver\\geckodriver.exe");
			dr=new FirefoxDriver();
		}
		
	//Enter the application url
		dr.get("http://www.facebook.com");
		dr.manage().window().maximize();	
	}
	
	/*@Test
	public void multiBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumwebdiriver\\driver\\chromedriver_win32\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("http://www.facebook.com");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//input[@id='email']")).sendKeys("gjhgkj");
		dr.findElement(By.xpath("//input[@id='pass']")).sendKeys("kueew");
		dr.findElement(By.xpath("//input[@id='u_0_a']")).click();
		
	}*/
	

}
